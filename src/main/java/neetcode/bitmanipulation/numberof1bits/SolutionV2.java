package neetcode.bitmanipulation.numberof1bits;

import static java.lang.System.out;

public class SolutionV2 {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        out.format("Number of 1 bits in (%s): %s", 125, hammingWeight(125));
    }
}
