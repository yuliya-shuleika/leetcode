package com.yuliana;

import java.util.Arrays;

public class SortAnArray_912_MergeSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().sortArray(new int[]{3, 5, 1, 3, 5, 1, 333, 2, 43, 26})));
    }

    static class Solution {

        public int[] sortArray(int[] nums) {
            mergeSort(nums);
            return nums;
        }

        private void mergeSort(int[] nums) {
            if (nums.length < 2) {
                return;
            }

            int mid = nums.length / 2;
            int[] left = Arrays.copyOfRange(nums, 0, mid);
            int[] right = Arrays.copyOfRange(nums, mid, nums.length);

            sortArray(left);
            sortArray(right);

            merge(left, right, nums);
        }

        private void merge(int[] left, int[] right, int[] result) {
            int leftPointer = 0;
            int rightPointer = 0;
            int resultPointer = 0;

            while (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer] = left[leftPointer];
                    leftPointer++;
                } else {
                    result[resultPointer] = right[rightPointer];
                    rightPointer++;
                }
                resultPointer++;
            }


            while (leftPointer < left.length) {
                result[resultPointer] = left[leftPointer];
                resultPointer++;
                leftPointer++;
            }


            while (rightPointer < right.length) {
                result[resultPointer] = right[rightPointer];
                resultPointer++;
                rightPointer++;
            }
        }
    }

}
