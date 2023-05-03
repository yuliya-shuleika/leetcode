package com.yuliana;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JList;

public class NaryTreePreOrderTraversal {

    public static void main(String[] args) {

    }

    static class Solution {
        public List<Integer> preorder(Node root) {
            if(root == null) {
                return List.of();
            }

            List<Integer> traversal = new ArrayList<>();
            preorder(traversal, root);

            return traversal;
        }

        public void preorder(List<Integer> traversal, Node node) {
            traversal.add(node.val);
            for(Node n : node.children) {
                preorder(traversal, n);
            }
        }
    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
