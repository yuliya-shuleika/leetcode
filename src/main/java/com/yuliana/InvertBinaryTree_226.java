package com.yuliana;

public class InvertBinaryTree_226 {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(3);
        node.right = new TreeNode(4);
        node.left.left = new TreeNode(8);
        node.right.left = new TreeNode(9);
        new Solution().invertTree(node);
    }

    static class Solution {

        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }

            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            invertTree(root.left);
            invertTree(root.right);

            return root;
        }
    }

}

