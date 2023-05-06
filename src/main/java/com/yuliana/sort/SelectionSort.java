package com.yuliana.sort;

import java.util.Arrays;

/**
 * Description
 *
 * Time complexity:
 * Worst(reversed ordered) - O(n^2)
 * Average - 0(n^2)
 * Best(array is sorted) - O(n^2)
 *
 * Space complexity: O(1)
 *
 * Stable: no
 *
 * Adaptive: no
 *
 * - Selection Sort has a slightly lower number of swaps compared to Bubble Sort,
 *   making it a better option when the cost of swapping elements is expensive.
 *
 * - It performs well for small arrays or cases where the input is already partially sorted
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,1,2,8,2,9,22,67,1,5};
        new Sort().selectionSortDesc(arr);
        System.out.println(Arrays.toString(arr));
    }

    static class Sort {
        public void selectionSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if(arr[j] < arr[min]) {
                        min = j;
                    }
                }

                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

        public void selectionSortDesc(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int max = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if(arr[j] > arr[max]) {
                        max = j;
                    }
                }

                int temp = arr[max];
                arr[max] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
