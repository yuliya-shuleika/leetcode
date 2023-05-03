package com.yuliana;

import java.util.HashMap;
import java.util.Map;

public class UniquePaths_62 {

    public static void main(String[] args) {
        System.out.println(new Solution().uniquePaths(3, 7));
    }

    static class Solution {

        Map<String, Integer> map = new HashMap<>();

        public int uniquePaths(int m, int n) {
            if (m == 1 && n == 1) {
                return 1;
            }

            if (m == 0 || n == 0) {
                return 0;
            }

            String key = m + "," + n;

            if (map.get(key) != null) {
                return map.get(key);
            }

            int paths = uniquePaths(m - 1, n) + uniquePaths(m, n - 1);
            map.put(key, paths);
            return paths;
        }

    }

}
