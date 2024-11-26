package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxConnectedComponentsTest {

    @Test
    public void testSolve() {
        // Test case 1
        int n1 = 1;
        int m1 = 1;
        String[] grid1 = { "." };
        assertEquals(1, MaxConnectedComponents.solve(n1, m1, grid1));

        // Test case 2
        int n2 = 4;
        int m2 = 2;
        String[] grid2 = {
            "..",
            "#.",
            "#.",
            ".#"
        };
        assertEquals(6, MaxConnectedComponents.solve(n2, m2, grid2));

        // Test case 3
        int n3 = 3;
        int m3 = 5;
        String[] grid3 = {
            ".#.#.",
            "..#..",
            ".#.#."
        };
        assertEquals(9, MaxConnectedComponents.solve(n3, m3, grid3));

        // Test case 4
        int n4 = 5;
        int m4 = 5;
        String[] grid4 = {
            "#...#",
            "....#",
            "#...#",
            ".....",
            "...##"
        };
        assertEquals(11, MaxConnectedComponents.solve(n4, m4, grid4));

        // Test case 5
        int n5 = 6;
        int m5 = 6;
        String[] grid5 = {
            ".#..#.",
            "#..#..",
            ".#...#",
            "#.#.#.",
            ".#.##.",
            "###..#"
        };
        assertEquals(15, MaxConnectedComponents.solve(n5, m5, grid5));

        // Test case 6
        int n6 = 6;
        int m6 = 8;
        String[] grid6 = {
            "..#....#",
            ".####.#.",
            "###.#..#",
            ".##.#.##",
            ".#.##.##",
            "#..##.#."
        };
        assertEquals(30, MaxConnectedComponents.solve(n6, m6, grid6));
    }
}
