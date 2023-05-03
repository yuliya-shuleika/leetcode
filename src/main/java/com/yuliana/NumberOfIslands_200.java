package com.yuliana;

import jdk.jshell.spi.SPIResolutionException;

public class NumberOfIslands_200 {

    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };

        char[][] grid2 = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        System.out.println(new Solution().numIslands(grid));
        System.out.println(new Solution().numIslands(grid2));

    }

    static class Solution {

        public int numIslands(char[][] grid) {
            int count = 0;

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == '1') {
                        count++;
                        dfs(grid, i, j);
                    }
                }
            }

            return count;
        }

        private void dfs(char[][] grid, int i, int j) {
            if (grid[i][j] == '0') {
                return;
            }

            grid[i][j] = '0';

            if (i > 0) {
                dfs(grid, i - 1, j);
            }

            if (j > 0) {
                dfs(grid, i, j - 1);
            }

            if (i < grid.length - 1) {
                dfs(grid, i + 1, j);
            }

            if (j < grid[0].length - 1) {
                dfs(grid, i, j + 1);
            }
        }
    }

}


