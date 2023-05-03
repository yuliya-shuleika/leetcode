package com.yuliana;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LetterCasePermutation_784 {

    public static void main(String[] args) {
        System.out.println(new Solution().letterCasePermutation("1a12b"));
    }


    static class Solution {

        private String s;
        private final List<String> result = new ArrayList<>();

        public List<String> letterCasePermutation(String s) {
            this.s = s.toLowerCase();
            if (Character.isLetter(s.charAt(0))) {
                letterCasePermutation(0, new ArrayList<>(), false);
                letterCasePermutation(0, new ArrayList<>(), true);
            } else {
                letterCasePermutation(0, new ArrayList<>(), false);
            }
            return result;

        }


        private void letterCasePermutation(int pos, List<Character> str, boolean isUpper) {
            for (int i = pos; i < s.length(); i++) {
                char c = s.charAt(pos);
                if (Character.isLetter(c)) {
                    c = isUpper ? (char) (c - 32) : c;
                }
                str.add(c);
                if (str.size() == s.length()) {
                    result.add(getStringRepresentation(str));
                } else if (pos < s.length() - 1 && Character.isLetter(s.charAt(pos + 1))) {
                    letterCasePermutation(++pos, str, false);
                    pos--;
                    letterCasePermutation(++pos, str, true);
                } else {
                    letterCasePermutation(++pos, str, false);
                }
                str.remove(str.size() - 1);
            }

        }

        private String getStringRepresentation(List<Character> list) {
            StringBuilder builder = new StringBuilder(list.size());
            for (Character ch : list) {
                builder.append(ch);
            }
            return builder.toString();
        }
    }

}
