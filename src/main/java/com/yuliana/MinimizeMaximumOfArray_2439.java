package com.yuliana;

public class MinimizeMaximumOfArray_2439 {

    public static void main(String[] args) {
        System.out.println(new Solution().minimizeArrayValue(new int[]{3,7,1,3}));

    }

    static class Solution {

        public int minimizeArrayValue(int[] nums) {
            long min = 0, sum = 0;

            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                min = Math.max(min, (sum + i) / (i + 1));
            }

            return (int) min;
        }

    }
}
