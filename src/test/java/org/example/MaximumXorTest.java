package org.example;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MaximumXorTest {
    MaximumXor mx = new MaximumXor();
    @Test
    public void testMaximumXor(){
        //TestCase 1
        int[] nums1 = {0, 1, 2, 3, 4};
        int[][] queries1 = {{3, 1}, {1, 3}, {5, 6}};
        int[] expected1 = {3, 3, 7};

        assertArrayEquals(expected1, mx.maximizeXor(nums1,queries1));

        //TestCase 2
        int[] nums2 = {5,2,4,6,6,3};
        int[][] queries2 = {{12,4},{8,1},{6,3}};
        int[] expected2 = {15,-1,5};
        assertArrayEquals(expected2, mx.maximizeXor(nums2,queries2));
    }



}
