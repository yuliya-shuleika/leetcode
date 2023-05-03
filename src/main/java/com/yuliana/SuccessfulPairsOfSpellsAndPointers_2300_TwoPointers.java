package com.yuliana;

import java.util.Arrays;
import java.util.Comparator;

public class SuccessfulPairsOfSpellsAndPointers_2300_TwoPointers {

    public static void main(String[] args) {
        int[] spells = {15,8,19};
        int[] potions = {38,36,23};
        long success = 328;
        System.out.println(Arrays.toString(successfulPairs(spells, potions, success)));
    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[][] spellsWithIndices = new int[spells.length][2];
        for (int i = 0; i < spells.length; i++) {
            spellsWithIndices[i][0] = spells[i];
            spellsWithIndices[i][1] = i;
        }

        Arrays.sort(spellsWithIndices, Comparator.comparing(a -> a[0]));
        Arrays.sort(potions);

        int[] result = new int[spells.length];
        int len = potions.length;
        int potionIndex = len - 1;

        for (int[] spellWithIndex : spellsWithIndices) {
            int spell = spellWithIndex[0];
            int index = spellWithIndex[1];

            while (potionIndex >= 0 && (long) spell * potions[potionIndex] >= success) {
                potionIndex -= 1;
            }
            result[index] = len - (potionIndex + 1);
        }

        return result;
    }

}
