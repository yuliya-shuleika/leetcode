package com.yuliana.sort;

import java.util.Arrays;

/**
 * Description
 *
 * Time complexity:
 * Worst(reversed ordered) - O(n^2)
 * Average - 0(n^2)
 * Best(array is sorted) - O(n)
 *
 * Space complexity: O(1)
 *
 * Stable: yes
 *
 * Adaptive: yes
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 1, 2, 8, 2, 9, 22, 2, 67, 1, 5};
        new Sort().insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static class Sort {
        public void insertionSort(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                int curr = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > curr) {
                    arr[j + 1] = arr[j];
                    j--;
                }

                arr[j + 1] = curr;
            }
        }
    }
}
