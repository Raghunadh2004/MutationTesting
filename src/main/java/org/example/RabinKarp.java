package org.example;

public class RabinKarp {

    public static int rabinKarpAlgo(String pattern, String text, int q) {
        int m = pattern.length(); // Length of the pattern
        int n = text.length(); // Length of the text
        int i, j, hash_p = 0, hash_t = 0, h = 1, d = 256; // d is the number of characters in the input alphabet
        int count = 0; // To count the occurrences of the pattern
        if (m > n)
            return 0;
        // The value of h would be "pow(d, m-1) % q"
        for (i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }

        // Calculate hash value for pattern and first window of text
        for (i = 0; i < m; i++) {
            hash_p = (d * hash_p + pattern.charAt(i)) % q;
            hash_t = (d * hash_t + text.charAt(i)) % q;
        }

        // Slide the pattern over text one character at a time
        for (i = 0; i <= n - m; i++) {

            // Check the hash values of the current window of text and pattern
            if (hash_p == hash_t) {
                // Check characters one by one
                for (j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                }

                // If hash_p == hash_t and pattern matches
                if (j == m) {
                    count++;
                }
            }

            // Calculate hash value for next window of text: Remove leading digit, add trailing digit
            if (i < n - m) {
                hash_t = (d * (hash_t - text.charAt(i) * h) + text.charAt(i + m)) % q;

                // Convert negative value of hash_t to positive
                if (hash_t < 0) {
                    hash_t = (hash_t + q);
                }
            }
        }

        return count;
    }
}
