package neetcode.arrayshashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

public class ContainsDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int num : nums) {
            if (uniques.contains(num)) {
                return true;
            }
            uniques.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 4, 5};
        out.format("Array %s contains duplicates: %s.%n",
                Arrays.toString(array), containsDuplicate(array));

        array = new int[]{1, 2, 4, 3, 5};
        out.format("Array %s contains duplicates: %s.%n",
                Arrays.toString(array), containsDuplicate(array));
    }
}
