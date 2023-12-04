package neetcode.dynamicprogramming1d.climbingstairs;

import static java.lang.System.out;

// optimal
public class SolutionV3 {
    public static int climbStairs(int n) {
        int a = 1;
        int b = 1;
        int c;

        for (int i = 0; i < n - 1; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        out.format("Ways of climbing (%s stairs): %s%n", 6, climbStairs(6));
    }
}
