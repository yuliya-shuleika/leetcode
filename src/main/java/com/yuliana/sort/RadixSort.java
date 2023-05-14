package com.yuliana.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 1, 2, 8, 2, 9, 22, 67, 1, 5};
        new Sort().radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static class Sort {
        public void radixSort(int[] arr) {
            int max = Arrays.stream(arr).max().orElse(0);

            List<Integer>[] radixes = new List[10];
            for (int i = 0; i < radixes.length; i++) {
                radixes[i] = new ArrayList<>();
            }

            int division = 1;

            while (max > 0) {
                for (int j : arr) {
                    int value = j / division % 10;
                    radixes[value].add(j);
                }

                int counter = 0;
                for (List<Integer> rad : radixes) {
                    for (int i : rad) {
                        arr[counter] = i;
                        counter++;
                    }
                    rad.clear();
                }

                division += 10;
                max = max / 10;
            }
        }
    }
}
