package com.yuliana;

public class SearchInBinaryTree_700 {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(3);
        node.right = new TreeNode(4);
        node.left.left = new TreeNode(8);
        node.right.left = new TreeNode(9);
        new Solution().searchBST(node, 4);
    }

    static class Solution {

        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null || root.val == val) {
                return root;
            }

            if (root.val > val) {
                return searchBST(root.left, val);
            }

            return searchBST(root.right, val);
        }
    }

}
