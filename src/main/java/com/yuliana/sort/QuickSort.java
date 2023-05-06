package com.yuliana.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

    }

    static class Sort {
        public void quickSort(int[] arr, int left, int right) {
            if (arr.length < 2) {
                return;
            }

            int partition = partition(arr, left, right);
            quickSort(arr, left, partition - 1);
            quickSort(arr, partition + 1, right);

        }

        private int partition(int[] arr, int left, int right) {
            int pivot = arr[0];

            return 0;
        }
    }
}
