package com.popular.searchalgos;

import java.util.Arrays;

/**
 * @author vidit.singh
 * @created 26/12/2021 - 16:54
 * Time complexity remains same in all cases. O(nlog n). Best searching algorithm. Only one disadvantage, it uses extra array.
 */
public class MergeSort {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] a = {29, 7, 55, 34, 23, 64, 21, 78, 99, 10, 41, 66, 6};
        mergeSort.mergeSort(a, 0, a.length - 1);
        Arrays.stream(a).forEach(System.out::println);
    }

    private void mergeSort(int[] arr, int start, int end) {

        if (end <= start) /** Means we have reached to the end of the traversal */
            return;

        int mid = (start + end) / 2;
        mergeSort(arr, 0, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
        /** Divide on conquer approach. Split the array into half until there only one left & right element left. It calls itself for lest side of the array & right side. */
    }

    private void merge(int[] arr, int start, int mid, int end) {
        int[] temp_array = new int[end - start + 1];

        int leftIndex = start;
        int rightIndex = mid + 1;
        int k = 0;

        while (leftIndex <= mid && rightIndex <= end) {
            /** Compare if the element at left is less than element at right index element of array. */
            if (arr[leftIndex] < arr[rightIndex]) {
                temp_array[k] = arr[leftIndex];
                leftIndex++;
            } else {
                temp_array[k] = arr[rightIndex];
                rightIndex++;
            }
            k++;
        }

        if (leftIndex <= mid) {
            /** If some how rightIndex elements is already sorted above loop, hence leftIndex mightn't have still reached till mid so manually putting leftovers to temp_array. */
            while (leftIndex <= mid) {
                temp_array[k] = arr[leftIndex];
                leftIndex++;
                k++;
            }
        } else {
            while (rightIndex <= end) {
                temp_array[k] = arr[rightIndex];
                rightIndex++;
                k++;
            }
        }

        for (int i = 0; i < temp_array.length; i++) { /** Transferring/writing the temp array to original array. start index may depend upon stages of divide & conquer */
            arr[start + i] = temp_array[i];
        }

    }

}
