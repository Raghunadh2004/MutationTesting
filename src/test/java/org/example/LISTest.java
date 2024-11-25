package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class LISTest {
    LIS lis = new LIS();

    @Test
    public void testLis(){
        // Test case 1
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        assertEquals(4, lis.lengthOfLIS(nums1));

        // Test case 2
        int[] nums2 = {0, 1, 0, 3, 2, 3};
        assertEquals(4, lis.lengthOfLIS(nums2));

        // Test case 3
        int[] nums3 = {7, 7, 7, 7, 7, 7, 7};
        assertEquals(1, lis.lengthOfLIS(nums3));

        // Test case 4
        int[] nums4 = {1, 3, 5, 4, 7};
        assertEquals(4, lis.lengthOfLIS(nums4));

        // Test case 5
        int[] nums5 = {};
        assertEquals(0, lis.lengthOfLIS(nums5));

        // Test case 6
        int[] nums6 = {2};
        assertEquals(1, lis.lengthOfLIS(nums6));
    }
}
