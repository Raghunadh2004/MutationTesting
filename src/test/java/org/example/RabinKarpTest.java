package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RabinKarpTest {

    @Test
    public void testRabinKarpAlgo() {
        // Test case 1: Simple match
        String text1 = "abcabcabc";
        String pattern1 = "abc";
        int q1 = 101; // A prime number
        assertEquals(3, RabinKarp.rabinKarpAlgo(pattern1, text1, q1));

        // Test case 2: Pattern not in text
        String text2 = "abcdefgh";
        String pattern2 = "xyz";
        int q2 = 101;
        assertEquals(0, RabinKarp.rabinKarpAlgo(pattern2, text2, q2));
//
        // Test case 3: Single character match
        String text3 = "aaaaaa";
        String pattern3 = "a";
        int q3 = 101;
        assertEquals(6, RabinKarp.rabinKarpAlgo(pattern3, text3, q3));
//
        // Test case 4: Pattern is longer than text
        String text4 = "abc";
        String pattern4 = "abcdef";
        int q4 = 101;
        assertEquals(0, RabinKarp.rabinKarpAlgo(pattern4, text4, q4));
//
        // Test case 5: Overlapping matches
        String text5 = "aaaa";
        String pattern5 = "aa";
        int q5 = 101;
        assertEquals(3, RabinKarp.rabinKarpAlgo(pattern5, text5, q5));
    }
}
