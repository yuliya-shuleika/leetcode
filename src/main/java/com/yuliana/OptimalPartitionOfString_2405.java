package com.yuliana;

import java.util.HashSet;
import java.util.Set;

public class OptimalPartitionOfString_2405 {

    public static void main(String[] args) {
        System.out.println(new Solution().partitionString("ssssss"));
    }

    static class Solution {
        private Set<Character> set = new HashSet<>();
        private int count = 1;

        public int partitionString(String s) {
            for (int i = 0; i < s.length(); i++) {
                if(!set.add(s.charAt(i))) {
                    set.clear();
                    count++;
                }
                set.add(s.charAt(i));
            }

            return count;
        }
    }

}
