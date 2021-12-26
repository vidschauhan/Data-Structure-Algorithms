package com.popular.searchalgos;

import java.util.Arrays;

/**
 * @author vidit.singh
 * @created 26/12/2021 - 13:16
 */
public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] a = insertionSort.sort(new int[]{29,7,55,34,23,64,21,78,99,10,41,66,6});
        Arrays.stream(a).forEach(System.out::println);
    }

    private int[] sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) { /** Starting from 1st position assuming that 0th element is sorted. */
            int element = arr[i];
            int j = i - 1; /** j will always be prev to i. reinitializing it again an again. */

            while (j >= 0 && arr[j] > element) {
                /** if j mean prev element is greater than element move element to right side until it fits to exact position,
             i.e check from left side of the element if it is still less than left elements, by decrementing j. */
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = element;
        }
        return arr;
    }
}
