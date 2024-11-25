package org.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class DestinationWaysTest {

    @Test
    public void testChange(){
        DestinationWays dw =  new DestinationWays();
        int n = 7;
        int[][] roads = {
                {0, 6, 7},
                {0, 1, 2},
                {1, 2, 3},
                {1, 3, 3},
                {6, 3, 3},
                {3, 5, 1},
                {6, 5, 1},
                {2, 5, 1},
                {0, 4, 5},
                {4, 6, 2}
        };
        int expected = 4;

        // Call the method to test
        int result = dw.countPaths(n, roads);

        // Assert the result
        assertEquals("The number of restricted paths is incorrect", expected, result);
    }

}
