package com.yuliana;

import java.util.ArrayDeque;
import java.util.Queue;

public class PopulatingNextRightPointers_116_BFS_MyVersion {

    public static void main(String[] args) {
        Node node = new Node(10);
        node.right = new Node(2);
        node.left = new Node(3);
        node.right.right = new Node(4);
        node.right.left = new Node(11);
        node.left.left = new Node(7);
        node.left.right = new Node(0);
        Node node1 = new Solution().connect(node);
    }

    static class Solution {

        public Node connect(Node root) {
            if (root == null) {
                return null;
            }
            Queue<Node> queue = new ArrayDeque<>();
            queue.add(root);

            int count = 1;

            while (!queue.isEmpty()) {
                Node current = queue.remove();
                count++;
                current.next = isTwoPower(count) ? null : queue.peek();

                if (current.left != null) {
                    queue.add(current.left);
                    queue.add(current.right);
                }
            }

            return root;

        }

        private boolean isTwoPower(int count) {
            int acc = 0;
            while (count != 0) {
                acc += count & 1;
                count = count >> 1;
                if (acc > 1) {
                    return false;
                }
            }

            return true;
        }


    }

}


