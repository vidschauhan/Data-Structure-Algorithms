package com.popular.searchalgos;

import java.util.Arrays;

/**
 * @author vidit.singh
 * @created 17/12/2021 - 19:52
 */
public class SelectionSort {

    public int[] sort(int[] arr) {
        int minimum;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            minimum = i; /** Take current index as min everytime to check with its immediate next value. if next value is min than swap the index. */
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minimum] > arr[j]) {
                    minimum = j; /** assign the new min */
                }
            }
            /** Swap the value at minimum to the current ith position */
            temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;

        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {2,4,6,8,9,3,22,45,78,99,1,41,66,277};
        int[] a = selectionSort.sort(arr);
        Arrays.stream(a).forEach(System.out::println);
    }
}
