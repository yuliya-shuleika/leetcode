package com.yuliana;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci_509 {

    public static void main(String[] args) {
        //1 1 2 3 5 8 13 21
        System.out.println(new Solution().fib(8));
    }

    static class Solution {

        private final Map<Integer, Integer> map = new HashMap<>();

        public int fib(int n) {
            if (n == 0) {
                return 0;
            }

            if (n == 1 || n == 2) {
                return 1;
            }

            if (map.containsKey(n)) {
                return map.get(n);
            }

            int curr = fib(n - 1) + fib(n - 2);
            map.put(n, curr);
            return curr;
        }
    }

}
