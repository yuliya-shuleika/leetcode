package com.yuliana.sort;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 1, 2, 8, 2, 9, 22, 67, 1, 5};
        new RadixSort.Sort().radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static class Sort {
        public void countingSort(int[] arr) {
            int max = Arrays.stream(arr).max().orElse(0);

            int[] counts = new int[max];
            for (int i : arr) {
                counts[i]++;
            }

            for (int i = 1; i < counts.length; i++) {
                counts[i] = counts[i - 1] + counts[i];
            }

            for (int i = arr.length; i > 0; i--) {
                counts[i] = counts[i - 1];
            }
            counts[0] = 0;
            int[] sortedArray = new int[arr.length];
            for (int j : arr) {
                sortedArray[counts[j]] = j;
                counts[j]++;
            }

            System.arraycopy(sortedArray, 0, arr, 0, arr.length);
        }
    }
}
