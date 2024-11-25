package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SumOfSubArrayRangesTest {

    @Test
    public void testSubarrayRanges() {
        SumOfSubArrayRanges srs = new SumOfSubArrayRanges();

        // Test Case 1
        int[] nums1 = {1, 2, 3};
        assertEquals(4, srs.subArrayRanges(nums1));

        // Test Case 2
        int[] nums2 = {1, 3, 3};
        assertEquals(4, srs.subArrayRanges(nums2));

        // Test Case 3
        int[] nums3 = {4, -2, -3, 4, 1};
        assertEquals(59, srs.subArrayRanges(nums3));

        // Test Case 4: Empty Array
        int[] nums4 = {};
        assertEquals(0, srs.subArrayRanges(nums4));

        // Test Case 5: Single Element
        int[] nums5 = {5};
        assertEquals(0, srs.subArrayRanges(nums5));
    }
}
