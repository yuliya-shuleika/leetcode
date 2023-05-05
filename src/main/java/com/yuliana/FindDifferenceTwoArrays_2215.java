package com.yuliana;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifferenceTwoArrays_2215 {
    public static void main(String[] args) {
        System.out.println(new Solution().findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2}));
    }

    static class Solution {
        public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            Set<Integer> list1 = new HashSet<>();
            Set<Integer> list2 = new HashSet<>();
            for (int num : nums1) {
                set1.add(num);
            }


            for (int num : nums2) {
                set2.add(num);
                if (!set1.contains(num)) {
                    list2.add(num);
                }
            }

            for (int num : nums1) {
                if (!set2.contains(num)) {
                    list1.add(num);
                }
            }


            return List.of(new ArrayList<>(list1), new ArrayList<>(list2));
        }
    }
}
