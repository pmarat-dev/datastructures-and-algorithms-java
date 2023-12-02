package neetcode.heappriorityqueue.klargestelement;

import java.util.PriorityQueue;

import static java.lang.System.out;

public class Solution {
    final PriorityQueue<Integer> heap = new PriorityQueue<>();
    final int k;

    public Solution(int k, int[] nums) {
        this.k = k;
        for (int n : nums) add(n);
    }

    public int add(int val) {
        if (heap.size() < k) heap.offer(val); //for adding the values of the array
        else if (val > heap.peek()) {
            heap.poll(); //remove the top element
            heap.add(val); //add the new element
        }
        return heap.peek();
    }

    public static void main(String[] args) {
        Solution solution = new Solution(3, new int[]{3, 5, 6, 1, 2, 7, 9});
        out.format("Kth largest element: %s%n", solution.add(0));
        out.format("Kth largest element: %s%n", solution.add(8));
        out.format("Kth largest element: %s%n", solution.add(-5));
        out.format("Kth largest element: %s%n", solution.add(11));
    }
}
