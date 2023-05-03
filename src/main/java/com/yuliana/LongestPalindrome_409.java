package com.yuliana;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome_409 {

    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("abccccdd"));
    }

    static class Solution {

        public int longestPalindrome(String s) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.merge(c, 1, Integer::sum);
            }

            int count = 0;

            for(int i : map.values()) {
                count += i / 2 * 2;
            }

            return count < s.length() ? ++count : count;
        }
    }

}
