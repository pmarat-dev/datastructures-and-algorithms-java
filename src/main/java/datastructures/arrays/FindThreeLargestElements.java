package datastructures.arrays;

import static java.lang.System.out;

class FindThreeLargestElements {
    static void print3largest(int[] arr) {
        int i, first, second, third, size = arr.length;

        if (size < 3) {
            out.print(" Invalid Input ");
            return;
        }

        third = first = second = Integer.MIN_VALUE;
        for (i = 0; i < size; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third)
                third = arr[i];
        }

        out.println("Three largest elements are " + first + " " + second + " " + third);
    }

    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};
        print3largest(arr);
    }
}