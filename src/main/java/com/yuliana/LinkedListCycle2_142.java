package com.yuliana;


import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle2_142 {

    public static void main(String[] args) {

    }

    static class Solution {

        public ListNode detectCycle(ListNode head) {
            Set<ListNode> set = new HashSet<>();

            while (head != null) {
                if (set.contains(head)) {
                    return head;
                } else {
                    set.add(head);
                }

                head = head.next;
            }

            return null;
        }
    }

    class SolutionTwoPointers {

        public ListNode detectCycle(ListNode head) {
            ListNode slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    break;
                }
            }
            if (fast == null || fast.next == null) {
                return null;
            }
            while (head != slow) {
                head = head.next;
                slow = slow.next;
            }
            return head;
        }


    }
}
