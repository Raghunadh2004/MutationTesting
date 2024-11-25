package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakingLargeIslandTest {

    @Test
    public void testChange(){
        MakingLargeIsland mli = new MakingLargeIsland();
        MakingLargeIsland.Solution solution = mli.new Solution();
        int[][] grid = {
                {1, 1,0},
                {1, 1,1},
                {1,0,0}
        };

        // Expected output: Since the whole grid is filled with 1s, the largest island is the entire grid, size 4
        int expected = 7;

        // Call the method that calculates the largest island size
        int result = solution.largestIsland(grid);

        // Assert that the result matches the expected output
        assertEquals(expected, result);
    }
}
