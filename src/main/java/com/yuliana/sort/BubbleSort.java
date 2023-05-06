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
 *
 * - It is primarily used for educational purposes or for small datasets
 *   where simplicity and ease of implementation are more important than efficiency.
 *
 * - Bubble Sort is called so because of the way smaller or larger elements "bubble"
 *   to their correct positions during each pass of the sorting process.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,1,2,8,2,9,22,67,1,5};
        new Sort().bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static class Sort {
        public void bubbleSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }


        public void bubbleSortDesc(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }
}
