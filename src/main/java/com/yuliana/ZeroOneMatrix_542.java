package com.yuliana;

import java.util.ArrayDeque;
import java.util.Queue;

public class ZeroOneMatrix_542 {

    public static void main(String[] args) {

    }

    static class Solution {

        int[] DIRECTIONS = new int[]{0, 1, 0, -1, 0};
        int NOT_SEEN = -1;

        public int[][] updateMatrix(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            Queue<int[]> queue = new ArrayDeque<>();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] == 0) {
                        queue.offer(new int[]{i, j});
                    } else {
                        mat[i][j] = NOT_SEEN;
                    }

                }

            }

            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int row = current[0];
                int column = current[1];

                //4 directions
                for (int i = 0; i < 4; i++) {
                    int newRow = row + DIRECTIONS[i];
                    int newColumn = column + DIRECTIONS[i + 1];
                    if(newRow < 0 || newColumn < 0
                        || newRow > m - 1 || newColumn > n-1
                        || mat[newRow][newColumn] != NOT_SEEN) {
                        continue;
                    }

                    mat[newRow][newColumn] = mat[row][column] + 1;
                    queue.offer(new int[]{newRow, newColumn});
                }
            }
            return mat;
        }
    }

}
