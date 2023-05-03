package com.yuliana;

import java.util.HashMap;
import java.util.Map;

public class MinCostClimbingStairs_746 {

    public static void main(String[] args) {
        System.out.println(new Solution().minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }

    static class Solution {

        Map<Integer, Integer> map = new HashMap<>();

        public int minCostClimbingStairs(int[] cost) {
            map.put(0, cost[0]);
            map.put(1, cost[1]);
            return Math.min(minCost(cost, cost.length - 1, map),minCost(cost, cost.length-2, map));
        }

        private int minCost(int[] cost, int i, Map<Integer, Integer> map) {
            if(map.containsKey(i)) {
                return map.get(i);
            }

            int currMin = cost[i] + Math.min(minCost(cost, i - 1, map), minCost(cost, i - 2, map));
            map.put(i, currMin);

            return currMin;
        }
    }

}
