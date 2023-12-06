package neetcode.mathgeometry.happynumber;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

class Solution {
    public static boolean isHappy(int n) {
        if (n == 1 || n == -1) {
            return true;
        }

        Set<Integer> visit = new HashSet<>();
        while (!visit.contains(n)) {
            visit.add(n);
            n = sumOfSquare(n);

            if (n == 1) return true;
        }

        return false;
    }

    public static int sumOfSquare(int n) {
        int output = 0;

        while (n != 0) {
            int digit = n % 10;
            digit = digit * digit;
            output += digit;
            n = n / 10;
        }

        return output;
    }

    public static void main(String[] args) {
        out.format("Is happy: %s%n", isHappy(19));
    }
}
