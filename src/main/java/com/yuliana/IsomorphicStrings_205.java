package com.yuliana;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings_205 {

    public static void main(String[] args) {
        System.out.println(new Solution().isIsomorphic("paper", "title"));
        System.out.println(new Solution().isIsomorphic("badc", "baba"));
    }

    static class Solution {

        public boolean isIsomorphic(String s, String t) {
            Map<Character, Character> map = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                Character curr1 = map.get(s.charAt(i));

                if (curr1 == null) {
                    if(map.containsValue(t.charAt(i))){
                        return false;
                    } else {
                        map.put(s.charAt(i), t.charAt(i));
                    }
                } else if (curr1 != t.charAt(i)) {
                    return false;
                }
            }

            return true;
        }
    }

}
