package neetcode.heappriorityqueue.laststoneweight;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

import static java.lang.System.out;

public class Solution {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) maxHeap.add(stone);
        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.remove();
            int stone2 = maxHeap.remove();
            if (stone1 != stone2) maxHeap.add(stone1 - stone2);
        }
        return !maxHeap.isEmpty() ? (maxHeap.remove()) : 0;
    }

    public static void main(String[] args) {
        int[] stones = new int[]{1, 4, 9, 90};
        out.format("Last stone weight (%s): %s%n",
                Arrays.toString(stones),
                lastStoneWeight(stones));
    }
}
