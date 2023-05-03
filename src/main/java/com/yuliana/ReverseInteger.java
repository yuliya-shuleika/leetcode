package com.yuliana;

public class ReverseInteger {

    public static void main(String[] args) {

        System.out.println(new Solution().reverse(Integer.MAX_VALUE));
        System.out.println(Integer.MAX_VALUE);


    }

    static class Solution {
        public int reverse(int toReverse) {
            toReverse = ((toReverse & 0xffff0000) >>> 16) | ((toReverse & 0x0000ffff) << 16);
            toReverse = ((toReverse & 0xff00ff00) >>> 8) | ((toReverse & 0x00ff00ff) << 8);
            toReverse = ((toReverse & 0xf0f0f0f0) >>> 4) | ((toReverse & 0x0f0f0f0f) << 4);
            toReverse = ((toReverse & 0xcccccccc) >>> 2) | ((toReverse & 0x33333333) << 2);
            toReverse = ((toReverse & 0xaaaaaaaa) >>> 1) | ((toReverse & 0x55555555) << 1);

            return toReverse;
        }
    }
}
