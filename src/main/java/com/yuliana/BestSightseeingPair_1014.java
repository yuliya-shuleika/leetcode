package com.yuliana;

public class BestSightseeingPair_1014 {

    public static void main(String[] args) {
        System.out.println(new Solution().maxScoreSightseeingPair(new int[]{8, 1, 5, 2, 6}));
    }

    static class Solution {

        public int maxScoreSightseeingPair(int[] values) {
            int maxLeft = values[0];
            int maxScore = 0;
            for (int i = 1; i < values.length; i++) {
                maxScore = Math.max(maxScore, maxLeft + values[i] - i);
                maxLeft = Math.max(maxLeft, values[i] + i);
            }

            return maxScore;
        }
    }

}
