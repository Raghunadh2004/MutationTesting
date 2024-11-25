package org.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class StatisticsTest {
    Statistics stats = new Statistics();

    @Test
    public void testStatisticsFunctions() {
        int[] data = {1, 2, 2, 3, 4, 4, 4, 5};

        // Testing mean
        assertEquals(3.125, stats.mean(data), 0.001);

        // Testing median
        assertEquals(3.5, stats.median(data), 0.001);

        // Testing mode
        assertEquals(4, stats.mode(data));

        // Testing variance
        assertEquals(1.609375, stats.variance(data), 0.001);

        // Testing standard deviation
        assertEquals(1.2686114456365, stats.standardDeviation(data), 0.001);

        // Testing range
        assertEquals(4, stats.range(data));

        // Testing cumulative sum
        assertArrayEquals(new int[]{1, 3, 5, 8, 12, 16, 20, 25}, stats.cumulativeSum(data));

        // Testing count unique
        assertEquals(5, stats.countUnique(data));

        // Testing min
        assertEquals(1, stats.getMin(data));

        // Testing max
        assertEquals(5, stats.getMax(data));

        // Testing interquartile range
        assertEquals(2.0, stats.interquartileRange(data), 0.001);

        // Testing percentile
        assertEquals(4, stats.percentile(data, 75), 0.001);

        // Testing top N
        assertArrayEquals(new int[]{5, 4, 4}, stats.getTopN(data, 3));
    }

    @Test
    public void testStatisticsFunctionsUnsortedArray() {
        Statistics stats = new Statistics();

        // Unsorted array
        int[] unsortedData = {5, 1, 4, 4, 2, 2, 3, 4};

        // Testing mean
        assertEquals(3.125, stats.mean(unsortedData), 0.001);

        // Testing median
        assertEquals(3.5, stats.median(unsortedData), 0.001);

        // Testing mode
        assertEquals(4, stats.mode(unsortedData));

        // Testing variance
        assertEquals(1.609375, stats.variance(unsortedData), 0.001);

        // Testing standard deviation
        assertEquals(1.2686114456365, stats.standardDeviation(unsortedData), 0.001);

        // Testing range
        assertEquals(4, stats.range(unsortedData));

        // Testing cumulative sum
        assertArrayEquals(new int[]{1,3,5,8,12,16,20,25}, stats.cumulativeSum(unsortedData));

        // Testing count unique
        assertEquals(5, stats.countUnique(unsortedData));

        // Testing min
        assertEquals(1, stats.getMin(unsortedData));

        // Testing max
        assertEquals(5, stats.getMax(unsortedData));

        // Testing interquartile range
        assertEquals(2.0, stats.interquartileRange(unsortedData), 0.001);

        // Testing percentile
        assertEquals(4, stats.percentile(unsortedData, 75), 0.001);

        // Testing top N
        assertArrayEquals(new int[]{5, 4, 4}, stats.getTopN(unsortedData, 3));
    }
}
