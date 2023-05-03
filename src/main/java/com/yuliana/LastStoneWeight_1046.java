package com.yuliana;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LastStoneWeight_1046 {

    public static void main(String[] args) {
        System.out.println(new Solution().lastStoneWeight(new int[] {1}));
    }

    static class Solution {
        public int lastStoneWeight(int[] stones) {
            PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
            Arrays.stream(stones).boxed().collect(Collectors.toCollection(() -> heap));

            while (heap.size() > 1) {
                int first = heap.poll();
                int second = heap.poll();

                if(first > second) {
                    heap.offer(first-second);
                }
            }

            return heap.isEmpty() ? 0 : heap.poll();

        }
    }

}
