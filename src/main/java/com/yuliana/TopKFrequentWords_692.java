package com.yuliana;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TopKFrequentWords_692 {

    public static void main(String[] args) {
        System.out.println(new Solution().topKFrequent(
            new String[]{"i","love","leetcode","i","love","coding"},
            2)
        );
    }

    static class Solution {
        public List<String> topKFrequent(String[] words, int k) {
            Map<String, Integer> map = new HashMap<>();
            for(String word : words) {
                map.merge(word, 1, Integer::sum);
            }

            Comparator<Entry<String, Integer>> comparator = (e1, e2) ->
                    Objects.equals(e1.getValue(), e2.getValue()) ?
                        e1.getKey().compareTo(e2.getKey()) :
                        (e1.getValue() > e2.getValue() ? -1 : 1);

            Queue<Entry<String, Integer>> queue = new PriorityQueue<>(comparator);
            queue.addAll(map.entrySet());

            List<String> result = new ArrayList<>();
            while (result.size() < k) {
                result.add(queue.poll().getKey());
            }
            return result;
        }
    }

}
