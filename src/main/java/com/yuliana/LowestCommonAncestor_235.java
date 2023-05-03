package com.yuliana;

public class LowestCommonAncestor_235 {

    public static void main(String[] args) {

    }


    static class Solution {

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root.val > p.val && root.val > q.val) {
                return lowestCommonAncestor(root.left, p, q);
            }

            if (root.val < p.val && root.val < q.val) {
                return lowestCommonAncestor(root.right, p, q);
            }

            return root;
        }
    }

}
