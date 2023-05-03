package com.yuliana;

public class JumpGame_55 {

    public static void main(String[] args) {
        System.out.println(new Solution().canJump(new int[]{3, 2, 1, 0, 4}));
        System.out.println(new Solution().canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(new Solution().canJump(new int[]{0, 3, 1, 1, 4}));
        System.out.println(new Solution().canJump(new int[]{0}));


    }

    static class Solution {

        public boolean canJump(int[] nums) {
            int goal = nums.length;
            boolean canReachGoal = true;

            for (int i = nums.length - 1; i > -1; i--) {
                if (goal - i <= nums[i]) {
                    goal = i;
                    canReachGoal = true;
                } else {
                    canReachGoal = false;
                }
            }

            return canReachGoal;
        }


    }

}
