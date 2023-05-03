package com.yuliana;

public class PopulatingNextRightPointers_116_DFS {
    public static void main(String[] args) {
        Node node = new Node(10);
        node.right = new Node(2);
        node.left = new Node(3);
        node.right.right = new Node(4);
        node.right.left = new Node(11);
        node.left.left = new Node(7);
        node.left.right = new Node(0);
    }

    static class Solution {

        public Node connect(Node root) {
            if (root == null) {
                return null;
            }

            Node left = root.left;
            Node right = root.right;
            Node next = root.next;

            if(left != null) {

                left.next = right;
                if (next != null) {
                    right.next = next.left;
                }

                connect(left);
                connect(right);
            }

            return root;
        }

    }
}
