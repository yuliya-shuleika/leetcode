package com.yuliana;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindAllAnagramsInString_438 {

    public static void main(String[] args) {

    }

    static class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            Set<String> anagrams = new HashSet<>();
            Map<Character, Integer> pMap = new HashMap<>();
            for (int i = 0; i < p.length(); i++) {
                pMap.merge(p.charAt(i), 1, Integer::sum);
            }

            int left = 0, right = 0;
            for (int i = 0; i < s.length(); i++) {
                while(true) {

                }
            }

            return List.of();
        }

        private boolean isAnagram() {
            return true;
        }

    }
}
