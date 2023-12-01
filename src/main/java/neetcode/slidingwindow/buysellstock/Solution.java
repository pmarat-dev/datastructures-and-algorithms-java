package neetcode.slidingwindow.buysellstock;

import java.util.Arrays;

import static java.lang.System.out;

public class Solution {
    public static int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] array = new int[]{4, 5, 8, 3, 3, 5, 9, 2};
        out.format("Max profit (%s): %s%n", Arrays.toString(array), maxProfit(array));
    }
}
