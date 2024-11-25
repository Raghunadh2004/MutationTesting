package org.example;

import java.util.Arrays;
import java.util.List;

public class Statistics {

    // Calculate mean
    public double mean(int[] data) {
        if (data.length == 0) return 0.0;
        double sum = 0;
        for (int value : data) {
            sum += value;
        }
        return sum / data.length;
    }

    // Calculate median
    public double median(int[] data) {
        if (data.length == 0) return 0.0; // Handle empty array
        Arrays.sort(data); // Sort the array
        int n = data.length;
        if (n % 2 == 0) {
            // For even number of elements, return the average of the two middle elements
            double med = data[n/2-1]+data[n/2];
            med = med/2;
            return med;
        } else {
            // For odd number of elements, return the middle element
            return data[n / 2];
        }
    }


    // Calculate mode
    public int mode(int[] data) {
        if (data.length == 0) return 0;
        int maxCount = 0, mode = data[0];
        int[] count = new int[Arrays.stream(data).max().orElse(0) + 1];
        for (int value : data) {
            count[value]++;
            if (count[value] > maxCount) {
                maxCount = count[value];
                mode = value;
            }
        }
        return mode;
    }

    // Calculate variance
    public double variance(int[] data) {
        if (data.length == 0) return 0.0;
        double mean = mean(data);
        double sum = 0;
        for (int value : data) {
            sum += Math.pow(value - mean, 2);
        }
        return sum / data.length;
    }

    // Calculate standard deviation
    public double standardDeviation(int[] data) {
        return Math.sqrt(variance(data));
    }

    // Calculate range
    public int range(int[] data) {
        if (data.length == 0) return 0;
        int min = Arrays.stream(data).min().orElse(0);
        int max = Arrays.stream(data).max().orElse(0);
        return max - min;
    }

    // Check if data is symmetrical
    public boolean isSymmetrical(int[] data) {
        if (data.length == 0) return true;
        int[] reversed = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            reversed[i] = data[data.length - 1 - i];
        }
        return Arrays.equals(data, reversed);
    }

    // Get cumulative sum
    public int[] cumulativeSum(int[] data) {
        int[] result = new int[data.length];
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
            result[i] = sum;
        }
        return result;
    }

    // Count unique elements
    public int countUnique(int[] data) {
        return (int) Arrays.stream(data).distinct().count();
    }

    // Get minimum value
    public int getMin(int[] data) {
        return Arrays.stream(data).min().orElse(0);
    }

    // Get maximum value
    public int getMax(int[] data) {
        return Arrays.stream(data).max().orElse(0);
    }

    // Get percentage of each value
    public double[] percentageDistribution(int[] data) {
        if (data.length == 0) return new double[0];
        double sum = Arrays.stream(data).sum();
        return Arrays.stream(data).mapToDouble(x -> (x / sum) * 100).toArray();
    }

    // Calculate interquartile range (IQR)
    public double interquartileRange(int[] data) {
        if (data.length == 0) return 0.0;
        Arrays.sort(data);
        double q1 = percentile(data, 25);
        double q3 = percentile(data, 75);
        return q3 - q1;
    }

    // Calculate percentile
    public double percentile(int[] data, int p) {
        if (data.length == 0 || p < 0 || p > 100) return 0.0;
        Arrays.sort(data);
        double index = (p / 100.0) * (data.length - 1);
        int lower = (int) Math.floor(index);
        int upper = (int) Math.ceil(index);
        if (lower == upper) {
            return data[lower];
        }
        return data[lower] + (index - lower) * (data[upper] - data[lower]);
    }

    // Check if data is uniform
    public boolean isUniform(int[] data) {
        return Arrays.stream(data).distinct().count() == 1;
    }

    // Get top N values
    public int[] getTopN(int[] data, int n) {
        return Arrays.stream(data).boxed()
                .sorted((a, b) -> b - a)
                .limit(n)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
