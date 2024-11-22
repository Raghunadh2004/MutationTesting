package org.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RestrictedPathsTest {

    @Test
    public void testExampleGraph() {
        RestrictedPaths restrictedPaths = new RestrictedPaths();
        RestrictedPaths.Solution solution = restrictedPaths.new Solution();

        int n = 5;
        int[][] edges = {
                {1, 2, 3},
                {1, 3, 3},
                {2, 3, 1},
                {1, 4, 2},
                {5, 2 , 2},
                {3, 5 , 1},
                {5,4, 10}
        };
        int expected = 3; // Expected restricted paths count
        assertEquals(expected, solution.countRestrictedPaths(n, edges));
    }

    @Test
    public void testSingleNodeGraph() {
        RestrictedPaths restrictedPaths = new RestrictedPaths();
        RestrictedPaths.Solution solution = restrictedPaths.new Solution();

        int n = 1;
        int[][] edges = {};
        int expected = 0; // No restricted paths possible
        assertEquals(expected, solution.countRestrictedPaths(n, edges));
    }
}
