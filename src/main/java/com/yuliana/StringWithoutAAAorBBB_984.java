package com.yuliana;

public class StringWithoutAAAorBBB_984 {

    public static void main(String[] args) {
        System.out.println(new Solution().strWithout3a3b(2, 6));
    }

    static class Solution {

        public String strWithout3a3b(int a, int b) {
            int curr = 0;
            char currChar;
            char prevChar = a > b ? 'a' : 'b';
            StringBuilder sb = new StringBuilder();
            while (a > 0 || b > 0) {
                if (prevChar == 'a' && curr >= 2 || curr < 2 && b > a) {
                    currChar = 'b';
                    b--;
                } else {
                    currChar = 'a';
                    a--;
                }

                if (currChar != prevChar) {
                    curr = 0;
                }

                curr++;
                sb.append(currChar);
                prevChar = currChar;
            }

            return sb.toString();
        }
    }

}
