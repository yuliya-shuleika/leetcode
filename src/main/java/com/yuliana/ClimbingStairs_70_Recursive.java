package com.yuliana;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs_70_Recursive {

    public static void main(String[] args) {

    }

    static class Solution {

        private Map<Integer, Integer> map = new HashMap<>();

        public int climbStairs(int n) {
            if (n == 1) {
                return 1;
            }

            if (n == 2) {
                return 2;
            }

            if (map.containsKey(n)) {
                return map.get(n);
            }

            int curr = climbStairs(n - 1) + climbStairs(n - 2);
            map.put(n, curr);
            return curr;

        }
    }

}
