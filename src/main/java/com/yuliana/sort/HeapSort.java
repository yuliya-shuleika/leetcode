package com.yuliana.sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 1, 2, 8, 2, 9, 22, 67, 1, 5};
        new Sort().heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static class Sort {
        public void heapSort(int[] arr) {
            int n = arr.length;

            for (int i = n / 2 - 1; i >= 0; i--)
                heapify(arr, n, i);

            for (int i = n - 1; i > 0; i--) {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                heapify(arr, i, 0);
            }


        }

        private void heapify(int[] arr, int n, int i) {
            int largest = i;
            int left = i * 2 + 1;
            int right = i * 2 + 2;


            if(left < n && arr[largest] < arr[left]) {
                largest = left;
            }

            if(right < n && arr[largest] < arr[right]) {
                largest = right;
            }

            if(largest != i) {
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;
            } else {
                return;
            }

            heapify(arr, n, largest);
        }
    }
}
