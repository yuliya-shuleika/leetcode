package com.yuliana;

import java.util.ArrayList;
import java.util.List;

public class Combinations_77 {

    public static void main(String[] args) {
        System.out.println(new Solution().combine(4, 2));
    }

    static class Solution {

        List<List<Integer>> result = new ArrayList<>();

        public List<List<Integer>> combine(int n, int k) {
            combine(1, n, k, new ArrayList<>(n));
            return result;
        }

        private void combine(int m, int n, int k, List<Integer> result) {
            for (int i = m; i <= n; i++) {
                result.add(i);
                if (result.size() == k) {
                    this.result.add(List.copyOf(result));
                } else {
                    combine(i + 1, n, k, result);
                }
                result.remove(result.size() - 1);
            }
        }
    }

}
