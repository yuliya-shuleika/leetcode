package com.yuliana;

import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {

    public static void main(String[] args) {
        System.out.println(new Solution().permute(new int[]{1, 2, 3, 4}));

    }

    static class Solution {

        List<List<Integer>> result = new ArrayList<>();

        public List<List<Integer>> permute(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                List<Integer> res = new ArrayList<>();
                res.add(nums[i]);
                boolean[] mask = new boolean[nums.length];
                mask[i] = true;
                permute(nums, mask, res);
            }

            return result;
        }

        private void permute(int[] nums, boolean[] mask, List<Integer> result) {
            for (int i = 0; i < nums.length; i++) {
                if (!mask[i]) {
                    result.add(nums[i]);
                    mask[i] = true;
                    if (result.size() == nums.length) {
                        this.result.add(List.copyOf(result));
                    } else {
                        permute(nums, mask, result);
                    }
                    mask[i] = false;
                    result.remove(result.size() - 1);
                }

            }
        }
    }
}
