package twopointers;

import static java.lang.Character.isLetterOrDigit;
import static java.lang.Character.toLowerCase;
import static java.lang.System.out;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char start = s.charAt(i);
            char end = s.charAt(j);

            if (!isLetterOrDigit(start)) {
                i++;
                continue;
            }

            if (!isLetterOrDigit(end)) {
                j--;
                continue;
            }

            if (toLowerCase(start) != toLowerCase(end)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        out.format("Is palindrome: %b",
                isPalindrome("A man, a plan, a canal: Panama"));
    }
}
