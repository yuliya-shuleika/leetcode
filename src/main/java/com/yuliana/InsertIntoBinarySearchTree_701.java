package com.yuliana;

public class InsertIntoBinarySearchTree_701 {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(4);
        node.left = new TreeNode(3);
        node.right = new TreeNode(9);
        node.left.left = new TreeNode(2);
        node.right.left = new TreeNode(8);
        new Solution().insertIntoBST(node, 5);
    }

    static class Solution {

        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null) {
                return new TreeNode(val);
            }

            TreeNode curr = root;
            TreeNode prev = root;
            while (curr != null) {
                if (curr.val > val) {
                    prev = curr;
                    curr = curr.left;
                } else {
                    prev = curr;
                    curr = curr.right;
                }
            }

            if (prev.val > val) {
                prev.left = new TreeNode(val);
            } else {
                prev.right = new TreeNode(val);
            }

            return root;
        }

    }

}
