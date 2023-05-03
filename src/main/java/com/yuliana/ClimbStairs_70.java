package com.yuliana;

public class ClimbStairs_70 {

    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(2));
    }

    static class Solution {
        public int climbStairs(int n) {
            if(n==1) return 1;

            int[] a =  new int[n];
            a[0]=1;
            a[1]=1;

            for(int i=2;i<n;i++){
                a[i]=a[i-1]+a[i-2];
            }
            return a[n-1];
        }
    }

}
