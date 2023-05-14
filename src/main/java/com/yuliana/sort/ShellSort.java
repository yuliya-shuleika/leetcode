package com.yuliana.sort;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3,4,1,2,8,2,9,22,67,1,5};
        new Sort().shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static class Sort {
        public void shellSort(int[] arr) {
            int gap = arr.length / 2;
            while (gap > 0) {
                int j = gap;
                while (j < arr.length) {
                    int i = j;
                    while (i - gap > -1 && arr[i] < arr[i - gap]) {
                        int temp = arr[i];
                        arr[i] = arr[i - gap];
                        arr[i - gap] = temp;
                        i-= gap;
                    }
                    j++;
                }
                gap /= 2;
            }
        }
    }
}
