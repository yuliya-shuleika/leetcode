package com.yuliana;

public class NumberOfEnclaves_1020 {

    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 0, 0},
            {1, 0, 1, 0},
            {0, 1, 1, 0},
            {0, 0, 0, 0}
        };

        System.out.println(new Solution().numEnclaves(grid));
        System.out.println(new Solution().numEnclaves(new int[][]{
                {0, 0, 0, 1, 1, 1, 0, 1, 0, 0},
                {1, 1, 0, 0, 0, 1, 0, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 0, 1, 0, 0},
                {0, 1, 1, 0, 0, 0, 1, 0, 1, 0},
                {0, 1, 1, 1, 1, 1, 0, 0, 1, 0},
                {0, 0, 1, 0, 1, 1, 1, 1, 0, 1},
                {0, 1, 1, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 1, 0, 0, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0, 0, 1}
        }));

    }

    static class Solution {

        private int currCount = 0;

        public int numEnclaves(int[][] grid) {
            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 1 && dfs(grid, i, j)) {
                        count += currCount;
                    }
                    currCount = 0;
                }
            }

            return count;
        }

        private boolean dfs(int[][] grid, int i, int j) {
            if (grid[i][j] == 0) {
                return true;
            }

            if (i == 0 || j == 0 || i == grid.length - 1 || j == grid[i].length - 1) {
                return false;
            }

            grid[i][j] = 0;
            currCount++;

            boolean right = dfs(grid, i, j + 1);
            boolean left = dfs(grid, i, j - 1);
            boolean up = dfs(grid, i - 1, j);
            boolean down = dfs(grid, i + 1, j);

            return right && left && up && down;
        }
    }

}
