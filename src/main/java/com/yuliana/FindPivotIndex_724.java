package com.yuliana;

public class FindPivotIndex_724 {

    public static void main(String[] args) {
        System.out.println(new Solution().pivotIndex(new int[]{1,7,3,6,5,6}));
        System.out.println(new Solution().pivotIndex(new int[]{1,2,3}));
        System.out.println(new Solution().pivotIndex(new int[]{2,1,-1}));

    }

    static class Solution {

        public int pivotIndex(int[] nums) {
            int[] prefixSum = new int[nums.length];
            int lastInd = prefixSum.length - 1;
            prefixSum[0] = nums[0];

            for (int i = 1; i < nums.length; i++) {
                prefixSum[i] = prefixSum[i - 1] + nums[i];
            }

            for (int i = 0; i < prefixSum.length; i++) {
                if (prefixSum[i] - nums[i] == prefixSum[lastInd] - prefixSum[i]) {
                    return i;
                }
            }

            return -1;
        }
    }

}
