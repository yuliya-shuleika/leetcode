package com.yuliana;

import java.util.Stack;
import java.util.stream.Collectors;

public class RemovingStarsFromString_2390 {

    public static void main(String[] args) {
        System.out.println(new Solution().removeStars("leet**cod*e"));
    }


    static class Solution {
        public String removeStars(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '*' && !stack.isEmpty()) {
                    stack.pop();
                } else if(s.charAt(i) != '*') {
                    stack.push(s.charAt(i));
                }
            }

            return stack.stream().map(Object::toString).collect(Collectors.joining(""));
        }
    }
}

