package com.yuliana;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatedCharacters_3 {

    static class Solution {

        public int lengthOfLongestSubstring(String s) {
            Set<Character> chars = new HashSet<>();
            int currLen = 0;
            int max = 0;
            int left = 0;
            int right = 0;
            char[] str = s.toCharArray();

            while (right < s.length()) {
                if (!chars.add(str[right])) {
                    if (str[left] != str[right]) {
                        chars.remove(str[left]);
                        currLen--;
                    } else {
                        right++;
                    }
                    left++;
                } else {
                    currLen++;
                    right++;
                }
                max = Math.max(currLen, max);
            }

            return max;

        }
    }
}
