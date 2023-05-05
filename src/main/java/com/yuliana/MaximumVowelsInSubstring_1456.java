package com.yuliana;

import java.util.Set;

public class MaximumVowelsInSubstring_1456 {
    public static void main(String[] args) {
        System.out.println(new Solution().maxVowels("leetcode", 3));
    }

    static class Solution {
        public int maxVowels(String s, int k) {
            Set<Character> vowels = Set.of('a', 'o', 'u', 'e', 'i');
            int max = 0;
            int left = 0;
            int right = 0;
            int curr = 0;
            while (right < s.length()) {
                if (right - left == k) {
                    if (vowels.contains(s.charAt(left))) {
                        curr--;
                    }
                    left++;
                }

                if (vowels.contains(s.charAt(right))) {
                    curr++;
                }
                right++;
                max = Math.max(curr, max);
            }

            return max;
        }
    }
}
