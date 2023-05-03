package com.yuliana;

public class HouseRobber2_213 {

    public static void main(String[] args) {

        System.out.println(new Solution().rob(new int[]{2, 3, 2}));
    }

    static class Solution {

        public int rob(int[] nums) {
            if(nums.length == 1) {
                return nums[0];
            }

            int[] dp = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                dp[i] = -1;
            }
            int first = rob(nums, 0, dp, nums.length - 1);

            for (int i = 0; i < nums.length; i++) {
                dp[i] = -1;
            }
            int second = rob(nums, 1, dp, nums.length);

            return Math.max(first, second);
        }

        public int rob(int[] nums, int i, int[] dp, int end) {
            if (i >= end) {
                return 0;
            }

            if (dp[i] != -1) {
                return dp[i];
            }

            return dp[i] = Math.max(rob(nums, i + 1, dp, end), rob(nums, i + 2, dp, end) + nums[i]);
        }
    }
}
