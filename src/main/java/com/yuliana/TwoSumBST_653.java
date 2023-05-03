package com.yuliana;

import java.util.HashSet;
import java.util.Set;

public class TwoSumBST_653 {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(3);
        node.right = new TreeNode(4);
        node.left.left = new TreeNode(8);
        node.right.left = new TreeNode(9);
        System.out.println(new Solution().findTarget(node, 17));
        System.out.println(new Solution().findTarget(node, 16));
        System.out.println(new Solution().findTarget(node, 11));
    }


    static class Solution {

        public boolean findTarget(TreeNode root, int k) {
            Set<Integer> set = new HashSet<>();
            return findTarget(root, k, set);
        }

        private boolean findTarget(TreeNode node, int k, Set<Integer> set) {
            if (node == null) {
                return false;
            }

            if (set.contains(k - node.val)) {
                return true;
            }

            set.add(node.val);

            return findTarget(node.left, k, set) || findTarget(node.right, k, set);
        }
    }
}
