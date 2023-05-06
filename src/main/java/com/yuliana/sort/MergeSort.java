package com.yuliana.sort;

import java.util.Arrays;

/**
 * Description
 *
 * Time complexity:
 * Worst(reversed ordered) - O(n*log(n))
 * Average - O(n*log(n))
 * Best(array is sorted) - O(n*log(n))
 *
 * Space complexity: O(1)
 *
 * Stable: yes
 *
 * Adaptive: yes
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 1, 2, 8, 2, 9, 22, 67, 1, 5};
        new Sort().mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static class Sort {
        public void mergeSort(int[] arr) {
            if (arr.length < 2) {
                return;
            }

            int mid = arr.length / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);

            mergeSort(left);
            mergeSort(right);

            merge(arr, left, right);
        }

        private void merge(int[] arr, int[] left, int[] right) {
            int leftPointer = 0;
            int rightPointer = 0;
            int arrPointer = 0;

            while (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    arr[arrPointer] = left[leftPointer];
                    leftPointer++;
                } else {
                    arr[arrPointer] = right[rightPointer];
                    rightPointer++;
                }

                arrPointer++;
            }

            while (leftPointer < left.length) {
                arr[arrPointer] = left[leftPointer];
                leftPointer++;
                arrPointer++;
            }

            while (rightPointer < right.length) {
                arr[arrPointer] = right[rightPointer];
                rightPointer++;
                arrPointer++;
            }
        }
    }
}
