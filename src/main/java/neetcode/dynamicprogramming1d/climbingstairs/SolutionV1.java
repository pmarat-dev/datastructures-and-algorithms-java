package neetcode.dynamicprogramming1d.climbingstairs;

import static java.lang.System.out;

// bottom-up
public class SolutionV1 {
    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        out.format("Ways of climbing (%s stairs): %s%n", 6, climbStairs(6));
    }
}
