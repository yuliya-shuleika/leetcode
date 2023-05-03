package com.yuliana;

public class FirstBadVersion_278 {
    static class VersionControl {
        boolean isBadVersion(int version) {
            return version >= 4;
        }
    }
    static class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int min = 0;
            int max = n;
            while (min < max) {
                int middle = min + (max - min) / 2;
                if (isBadVersion(middle)) {
                    max = middle;
                } else {
                    min = middle + 1;
                }
            }
            return min;
        }

        public int lastGoodVersion(int n) {
            int min = 0;
            int max = n;
            while (min < max) {
                int middle = min + (max - min) / 2;
                if (!isBadVersion(middle)) {
                    min = middle;
                } else {
                    max = middle - 1;
                }
            }
            return min;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().firstBadVersion(12));
        System.out.println(new Solution().lastGoodVersion(12));
    }
}
