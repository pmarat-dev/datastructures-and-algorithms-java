package neetcode.binarysearch.binarysearch;

import java.util.Arrays;

import static java.lang.System.out;

public class Solution {
    public static int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 5, 6, 7, 8, 13, 15, 20, 21};
        int target = 6;
        out.format("Search result (%s, %s): %s",
                Arrays.toString(array), target, search(array, target));
    }
}
