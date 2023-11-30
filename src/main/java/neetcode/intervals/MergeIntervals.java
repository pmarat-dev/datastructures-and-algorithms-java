package neetcode.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.max;
import static java.lang.System.out;
import static java.util.Arrays.sort;
import static java.util.Comparator.comparingInt;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        sort(intervals, comparingInt(a -> a[0]));
        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.getLast()[1] = max(merged.getLast()[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] result = merge(new int[][]{{1, 4}, {2, 5}, {7, 10}, {10, 11}});
        out.println(result);
    }
}
