package neetcode.bitmanipulation.singleelement;

import static java.lang.System.out;

public class Solution {
    public static int singleNumber(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) ans ^= nums[i];
        return ans;
    }

    public static void main(String[] args) {
        out.format("Single element: %s%n", singleNumber(new int[]{1, 3, 1, 1, 1, 1, 1}));
    }
}
