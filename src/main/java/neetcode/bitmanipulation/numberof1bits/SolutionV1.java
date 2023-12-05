package neetcode.bitmanipulation.numberof1bits;

import static java.lang.System.out;

public class SolutionV1 {
    public static int hammingWeight(int n) {
        int count = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        out.format("Number of 1 bits in (%s): %s", 125, hammingWeight(125));
    }
}
