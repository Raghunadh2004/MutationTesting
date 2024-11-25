package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MedianOfTwoSortedArraysTest {
    MedianOfTwoSortedArrays ms = new MedianOfTwoSortedArrays();

    @Test
    public void testMedian()
    {
        // Test case 1
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double expectedMedian1 = 2.0; // Median of [1, 2, 3] is 2.0
        assertEquals(expectedMedian1, ms.findMedianSortedArrays(nums1, nums2), 0.001);

        // Test case 2
        int[] nums1_2 = {1, 5, 9};
        int[] nums2_2 = {2, 6, 10};
        double expectedMedian2 = 5.5; // Median of [1, 2, 5, 6, 9, 10] is 5.5
        assertEquals(expectedMedian2, ms.findMedianSortedArrays(nums1_2, nums2_2), 0.001);

        // Test case 3
        int[] nums1_3 = {0, 4, 8};
        int[] nums2_3 = {1, 5, 7, 9};
        double expectedMedian3 = 5.0; // Median of [0, 1, 4, 5, 7, 8, 9] is 5.0
        assertEquals(expectedMedian3, ms.findMedianSortedArrays(nums1_3, nums2_3), 0.001);

        // Test case 4
        int[] nums1_4 = {};
        int[] nums2_4 = {1, 2, 3};
        double expectedMedian4 = 2.0; // Median of [1, 2, 3] is 2.0
        assertEquals(expectedMedian4, ms.findMedianSortedArrays(nums1_4, nums2_4), 0.001);

        // Test case 5
        int[] nums1_5 = {1, 2, 3};
        int[] nums2_5 = {4, 5, 6};
        double expectedMedian5 = 3.5; // Median of [1, 2, 3, 4, 5, 6] is 3.5
        assertEquals(expectedMedian5, ms.findMedianSortedArrays(nums1_5, nums2_5), 0.001);
    }
}
