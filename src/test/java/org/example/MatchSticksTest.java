package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MatchSticksTest {
    MatchSticks ms = new MatchSticks();

    @Test
    public void testMatchSticks() {
        // Test Case 1
        int[] matchsticks1 = {1, 1, 2, 2, 2};
        boolean expected1 = true;
        boolean result1 = ms.makesquare(matchsticks1);
        assertEquals("Failed for matchsticks = [1, 1, 2, 2, 2]", expected1, result1);

        // Test Case 2
        int[] matchsticks2 = {3, 3, 3, 3, 4};
        boolean expected2 = false;
        boolean result2 = ms.makesquare(matchsticks2);
        assertEquals("Failed for matchsticks = [3, 3, 3, 3, 4]", expected2, result2);
    }
}
