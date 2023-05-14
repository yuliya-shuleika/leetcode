package com.yuliana.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 1, 2, 8, 2, 9, 22, 67, 1, 5};
        new Sort().quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static class Sort {
        public void quickSort(int[] arr, int left, int right) {
            if (left < right) {
                int partition = partitionPivotFirstEl(arr, left, right);
                quickSort(arr, left, partition - 1);
                quickSort(arr, partition + 1, right);
            }

        }

        private int partitionPivotFirstEl(int[] arr, int left, int right) {
            int pivot = arr[left];
            int j = left;

            for (int i = left + 1; i <= right; i++) {
                if (arr[i] <= pivot) {
                    j++;

                    if (i != j) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            arr[left] = arr[j];
            arr[j] = pivot;
            return j;
        }

        private int partitionPivotLastEl(int[] arr, int left, int right) {
            int pivot = arr[right];
            int j = left - 1;

            for (int i = left; i < right; i++) {
                if (arr[i] <= pivot) {
                    j++;

                    if (i != j) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            arr[right] = arr[j + 1];
            arr[j + 1] = pivot;
            return j + 1;
        }
    }
}
