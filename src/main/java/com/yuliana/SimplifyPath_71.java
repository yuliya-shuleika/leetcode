package com.yuliana;

import java.util.Stack;

public class SimplifyPath_71 {

    public static void main(String[] args) {
        String path = "/../";
        System.out.println(new Solution().simplifyPath(path));
    }

    static class Solution {

        public String simplifyPath(String path) {
            String[] directories = path.split("/+");
            Stack<String> stack = new Stack<>();
            for (String dir : directories) {
                if (dir.equals("..") && !stack.isEmpty()) {
                    stack.pop();
                } else if (!dir.equals(".") && !dir.isEmpty() && !dir.equals("..")) {
                    stack.push(dir);
                }
            }

            return "/" + String.join("/", stack);
        }
    }

}
