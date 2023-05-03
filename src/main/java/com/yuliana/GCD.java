package com.yuliana;

public class GCD {

    public static void main(String[] args) {
        System.out.println(new Solution().gcd(9, 12));  //3
        System.out.println(new Solution().gcd(9, 18));  //9
        System.out.println(new Solution().gcd(18, 12));  //6
        System.out.println(new Solution().gcd(18, 25));  //1
        System.out.println(new Solution().gcd(1, 1));  //1


    }

    static class Solution {

        public int gcd(int a, int b) {
            int divider = Math.min(a, b);

            while(divider > 0){
                if(a % divider == 0 && b % divider == 0) {
                    return divider;
                }

                divider--;
            }

            return 1;
        }
    }

    int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }

}
