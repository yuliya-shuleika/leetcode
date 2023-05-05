package com.yuliana;

import java.util.ArrayDeque;
import java.util.Queue;

public class Dota2Senate_649 {
    public static void main(String[] args) {

    }

    static class Solution {
        public String predictPartyVictory(String senate) {
            Queue<Character> senatorsToLoseRights = new ArrayDeque<>();
           // String s =
            for (int i = 0; i < senate.length(); i++) {
                if(senatorsToLoseRights.remove() != senate.charAt(i)) {
                    char senatorToLooseRights = senate.charAt(i) == 'R' ? 'D' : 'R';
                    senatorsToLoseRights.offer(senatorToLooseRights);
                }
            }
            return "";

        }
    }
}
