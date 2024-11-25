package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionArrayTest {

    @Test
    public void testMaxSumAfterPartitioning() {
        PartitionArray solution = new PartitionArray();

        // Test case 1
        int[] arr1 = {1, 15, 7, 9, 2, 5, 10};
        int k1 = 3;
        assertEquals(84, solution.maxSumAfterPartitioning(arr1, k1));

        // Test case 2
        int[] arr2 = {1, 4, 1, 5, 7, 3, 6, 1, 9, 9, 3};
        int k2 = 4;
        assertEquals(83, solution.maxSumAfterPartitioning(arr2, k2));

        // Test case 3
        int[] arr3 = {1};
        int k3 = 1;
        assertEquals(1, solution.maxSumAfterPartitioning(arr3, k3));

        // Test case 4
        int[] arr4 = {3, 7, 2, 1, 6};
        int k4 = 2;
        assertEquals(29, solution.maxSumAfterPartitioning(arr4, k4));

        // Test case 5
        int[] arr5 = {10, 20, 30, 40};
        int k5 = 2;
        assertEquals(120, solution.maxSumAfterPartitioning(arr5, k5));
    }
}
