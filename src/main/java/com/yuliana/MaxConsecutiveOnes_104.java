package com.yuliana;

public class MaxConsecutiveOnes_104 {

    public static void main(String[] args) {
        System.out.println(new Solution().longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2)); //6
        System.out.println(new Solution().longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3)); //10
    }

    static class Solution {

        public int longestOnes(int[] nums, int k) {
            int onesCount = 0;
            int left = 0;
            int longest = 0;

            for (int right = 0; right < nums.length; right++) {
                if (nums[right] == 1) {
                    onesCount++;
                }

                int zeroesCount = (right - left + 1) - onesCount;
                if (zeroesCount > k) {
                    if (nums[left] == 1) {
                        onesCount--;
                    }
                    left++;
                }

                longest = Math.max(longest, right - left + 1);
            }

            return longest;
        }
    }

}
