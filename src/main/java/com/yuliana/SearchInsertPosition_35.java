package com.yuliana;

public class SearchInsertPosition_35 {

    static class Solution {
        public int searchInsert(int[] nums, int target) {
            int low = 0;
            int high = nums.length - 1;
            if(target > nums[high]) {
                return high + 1;
            } else if (target < nums[low]) {
                return 0;
            }

            while (low < high) {
                int mid = low + (high - low)/2;
                if(nums[mid] == target) {
                    return mid;
                } else if(target > nums[mid]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

            return low;

        }
    }

}
