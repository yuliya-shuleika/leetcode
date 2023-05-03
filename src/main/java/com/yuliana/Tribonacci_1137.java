package com.yuliana;

import java.util.HashMap;
import java.util.Map;

public class Tribonacci_1137 {

    public static void main(String[] args) {
        System.out.println(new Solution().tribonacci(25));
    }

    static class Solution {

        private final Map<Integer, Integer> map = new HashMap<>();

        public int tribonacci(int n) {
            if (n == 0) {
                return 0;
            }

            if (n == 1 || n == 2) {
                return 1;
            }

            if (map.containsKey(n)) {
                return map.get(n);
            }

            int curr = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
            map.put(n, curr);
            return curr;
        }
    }
}
