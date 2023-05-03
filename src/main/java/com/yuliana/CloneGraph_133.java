package com.yuliana;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph_133 {

    public static void main(String[] args) {
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);

        node1.neighbors.addAll(List.of(node2, node4));
        node2.neighbors.addAll(List.of(node1, node3));
        node3.neighbors.addAll(List.of(node2, node4));
        node4.neighbors.addAll(List.of(node1, node3));

        GraphNode node = new Solution().cloneGraph(node1);

        System.out.println(node.val);
        System.out.println(node.neighbors);
    }

    static class Solution {

        public GraphNode cloneGraph(GraphNode node) {
            if (node == null) {
                return null;
            }

            Map<Integer, GraphNode> map = new HashMap<>();

            return dfs(node, map);
        }

        private GraphNode dfs(GraphNode node, Map<Integer, GraphNode> map) {
            if (map.containsKey(node.val)) {
                return map.get(node.val);
            }
            GraphNode newNode = new GraphNode(node.val);
            map.put(newNode.val, newNode);

            for (GraphNode nei : node.neighbors) {
                newNode.neighbors.add(dfs(nei, map));
            }

            return newNode;

        }
    }
}
