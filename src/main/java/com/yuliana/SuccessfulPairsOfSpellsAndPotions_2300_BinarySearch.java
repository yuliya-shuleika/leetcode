package com.yuliana;

import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPotions_2300_BinarySearch {

    public static void main(String[] args) {
        int[] spells = {15,8,19};
        int[] potions = {38,36,23};
        long success = 328;
        System.out.println(Arrays.toString(new Solution().successfulPairs(spells, potions, success)));

    }

    static class Solution {

        public int[] successfulPairs(int[] spells, int[] potions, long success) {
            Arrays.sort(potions);
            int len = spells.length;
            int[] result = new int[len];
            for (int i = 0; i < len; i++) {
                result[i] = potions.length - binarySearch(potions, success, spells[i]);
            }

            return result;
        }

        private int binarySearch(int[] potions, long target, int spell) {
            int left = 0;
            int right = potions.length;
            while (left < right) {
                int mid = (left + right) / 2;
                if ((long)spell * potions[mid] <= target) {
                    right = mid ;
                } else {
                    left = mid +1;
                }
            }

            return left;
        }
    }

}
