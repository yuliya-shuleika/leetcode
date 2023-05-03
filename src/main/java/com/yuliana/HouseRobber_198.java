package com.yuliana;

public class HouseRobber_198 {

    public static void main(String[] args) {
        System.out.println(new Solution().rob(new int[]{2, 7, 9, 3, 1}));
    }

    static class Solution {

        public int rob(int[] nums) {
            int[] dp = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                dp[i] = -1;
            }

            return rob(nums, 0, dp);
        }

        public int rob(int[] nums, int i, int[] dp) {
            if (i >= nums.length) {
                return 0;
            }

            if(dp[i] != -1) {
                return dp[i];
            }

            return dp[i] = Math.max(rob(nums, i + 1, dp), rob(nums, i + 2, dp) + nums[i]);
        }
    }
}


