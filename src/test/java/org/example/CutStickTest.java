package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

public class CutStickTest {

    @Test
    public void testMinCost() {
        CutStick solution = new CutStick();

        // Test case 1
        int n1 = 7;
        int[] cuts1 = {1, 3, 4, 5};
        assertEquals(16, solution.minCost(n1, cuts1));

        // Test case 2
        int n2 = 9;
        int[] cuts2 = {5, 6, 1, 4, 2};
        assertEquals(22, solution.minCost(n2, cuts2));

        // Test case 3
        int n3 = 6;
        int[] cuts3 = {1, 2, 4};
        assertEquals(12, solution.minCost(n3, cuts3));

        // Test case 4
        int n4 = 10;
        int[] cuts4 = {4, 1, 8, 2};
        assertEquals(22, solution.minCost(n4, cuts4));

        // Test case 5
        int n5 = 20;
        int[] cuts5 = {2, 8, 10, 15};
        assertEquals(47, solution.minCost(n5, cuts5));

        // Test case 6
        int n6 = 5;
        int[] cuts6 = {3};
        assertEquals(5, solution.minCost(n6, cuts6));
    }
}
