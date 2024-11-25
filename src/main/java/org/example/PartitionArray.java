package org.example;

import java.util.*;

public class PartitionArray {

        private int solveMemo(int[] arr, int k, int idx, int[] dp) {
            // Base Case
            if (idx == arr.length)
                return 0;

            if (dp[idx] != -1)
                return dp[idx];

            // step-3=>if not calculated yet just calculate it and store it in thr dp[idx]
            int max = 0;
            int res = 0;
            for (int i = idx; i < idx + k && i < arr.length; i++) {
                max = Math.max(max, arr[i]);
                res = Math.max(res, solveMemo(arr, k, i + 1, dp) + (i - idx + 1) * max);
            }
            return dp[idx] = res;
        }

        public int maxSumAfterPartitioning(int[] arr, int k) {
            // step-1 => dp creation...
            int[] dp = new int[arr.length];
            Arrays.fill(dp, -1);
            return solveMemo(arr, k, 0, dp);
        }

}
