package neetcode.dynamicprogramming1d.climbingstairs;

import java.util.Arrays;

import static java.lang.System.out;

// top-down
public class SolutionV2 {
    public static int climbStairs(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);

        return climbStairs(n - 1, memo) + climbStairs(n - 2, memo);
    }

    private static int climbStairs(int n, int[] memo) {
        if (n < 0) return 0;
        if (n == 0 || n == 1) {
            memo[n] = 1;
            return memo[n];
        }
        if (memo[n] != -1) return memo[n];

        memo[n] = climbStairs(n - 1, memo) + climbStairs(n - 2, memo);
        return memo[n];
    }
    public static void main(String[] args) {
        out.format("Ways of climbing (%s stairs): %s%n", 6, climbStairs(6));
    }
}
