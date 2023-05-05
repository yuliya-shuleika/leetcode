package com.yuliana;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray_34 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
    }

    static class Solution {
        public int[] searchRange(int[] nums, int target) {
            if (nums.length < 1) {
                return new int[]{-1, -1};
            }
            int left = 0;
            int right = nums.length;
            int[] res = new int[2];
            while (left < right) {
                int mid = (right - left) / 2 + left;
                if (nums[mid] >= target) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            if (left > nums.length || nums[left] != target) {
                return new int[]{-1, -1};
            } else {
                res[0] = left;
            }
            left = 0;
            right = nums.length;

            while (left < right) {
                int mid = (right - left) / 2 + left;
                if (nums[mid] <= target) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            res[1] = left - 1;
            return res;
        }
    }
}
