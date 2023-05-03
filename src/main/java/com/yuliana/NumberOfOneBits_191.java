package com.yuliana;

public class NumberOfOneBits_191 {

    public static void main(String[] args) {

    }

    static class Solution {

        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int count = 0;
            while (n != 0) {
                count += n & 1;
                n = n >>> 1;
            }

            return count;
        }
    }

}
