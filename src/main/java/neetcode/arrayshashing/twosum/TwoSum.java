package neetcode.arrayshashing.twosum;

import java.util.Arrays;
import java.util.HashMap;

import static java.lang.System.out;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[]{prevMap.get(diff), i};
            }

            prevMap.put(num, i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 11, 4, 5, 9};
        int target = 8;

        out.format("Sum of target (%s, %s): %s%n",
                Arrays.toString(nums), target, Arrays.toString(twoSum(nums, target)));
    }
}
