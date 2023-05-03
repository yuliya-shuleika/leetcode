package com.yuliana;

public class PathSum_112 {

    public static void main(String[] args) {}

    static class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            if(root == null) {
                return false;
            }

            return hasPathSum(root, targetSum, 0);
        }

        private boolean hasPathSum(TreeNode node, int targetSum, int currentSum) {
            currentSum += node.val;

            if(node.left == null && node.right == null) {
                return currentSum == targetSum;
            }

            return (node.right !=  null && hasPathSum(node.right, targetSum, currentSum))
                || (node.left !=  null && hasPathSum(node.left, targetSum, currentSum));
        }
    }

}
