package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class ReversePairsTest {
    ReversePairs rp = new ReversePairs();

    @Test
    public void testCountReversePairs() {
        // Test case 1
        int[] nums1 = {1, 3, 2, 3, 1};
        int expected1 = 2; // Reverse pairs: (3,1), (3,1)
        assertEquals(expected1, rp.reversePairs(nums1));

        // Test case 2
        int[] nums2 = {2, 4, 3, 5, 1};
        int expected2 = 3; // Reverse pairs: (2,1), (4,1), (3,1)
        assertEquals(expected2, rp.reversePairs(nums2));

        // Test case 3
        int[] nums3 = {5, 4, 3, 2, 1};
        int expected3 = 4; // Reverse pairs: (5,2), (5,1), (4,1), (3,1)
        assertEquals(expected3, rp.reversePairs(nums3));

        // Test case 4 (No reverse pairs)
        int[] nums4 = {1, 2, 3, 4, 5};
        int expected4 = 0;
        assertEquals(expected4, rp.reversePairs(nums4));
    }
}
