package com.yuliana;

import java.util.List;
import java.util.Stack;

public class ImplementQueueUsingStacks_232 {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(6);
        System.out.println(queue.pop());
    }

    static class MyQueue {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        public MyQueue() {

        }

        public void push(int x) {
            stack1.push(x);

        }

        public int pop() {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            int result = stack2.pop();

            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }

            return result;
        }

        public int peek() {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            int result = stack2.peek();

            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }

            return result;
        }

        public boolean empty() {
            return stack1.isEmpty();
        }
    }

}
