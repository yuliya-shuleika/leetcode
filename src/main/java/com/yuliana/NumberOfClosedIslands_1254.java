package com.yuliana;

public class NumberOfClosedIslands_1254 {

    public static void main(String[] args) {
        int[][] grid = new int[][]{
            {1, 1, 1, 1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0, 1, 1, 0},
            {1, 0, 1, 0, 1, 1, 1, 0},
            {1, 0, 0, 0, 0, 1, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 0}
        };

        System.out.println(new Solution().closedIsland(grid));
    }

    static class Solution {

        public int closedIsland(int[][] grid) {
            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 0 && dfs(grid, i, j)) {
                        count++;

                    }
                }
            }

            return count;
        }

        private boolean dfs(int[][] grid, int i, int j) {
            if (i < 0 || i == grid.length || j < 0 || j == grid[i].length) {
                return false;
            }

            if (grid[i][j] == 1) {
                return true;
            }

            grid[i][j] = 1;

            return dfs(grid, i - 1, j) && dfs(grid, i, j - 1) &&
                dfs(grid, i + 1, j) && dfs(grid, i, j + 1);
        }

    }

}
