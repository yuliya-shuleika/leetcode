package com.yuliana;

public class SingleNumber_136 {

    public static void main(String[] args) {
        System.out.println(new Solution().singleNumber(new int[]{1,2,1,2,6,7,7}));
    }


    static class Solution {
        public int singleNumber(int[] nums) {
            int xor = 0;
            for(int n : nums) {
                xor = xor ^ n;
            }

            return xor;
        }
    }

}
