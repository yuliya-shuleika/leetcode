package com.yuliana;

public class BestTimeToBuyAndSellStock2_122 {

    public static void main(String[] args) {

    }

    static class Solution {

        public int maxProfit(int[] prices) {
            int profit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i - 1] > prices[i]) {
                    profit += prices[i - 1] - prices[i];
                }
            }

            return profit;
        }
    }

}
