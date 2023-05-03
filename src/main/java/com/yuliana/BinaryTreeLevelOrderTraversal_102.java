package com.yuliana;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal_102 {

    public static void main(String[] args) {

    }

    static class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            if(root == null) {
                return List.of();
            }
            List<List<Integer>> result = new ArrayList<>();
            Queue<TreeNode> queue = new ArrayDeque<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                List<Integer> currLevel = new ArrayList<>();
                result.add(currLevel);

                for (int i = 0; i < levelSize; i++) {
                    TreeNode curr = queue.poll();
                    currLevel.add(curr.val);

                    if(curr.left != null) {
                        queue.offer(curr.left);
                    }

                    if(curr.right != null) {
                        queue.offer(curr.right);
                    }
                }
            }

            return result;
        }
    }
}
