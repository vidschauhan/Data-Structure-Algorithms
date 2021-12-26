package com.popular.searchalgos;

import java.util.Arrays;

/**
 * @author vidit.singh
 * @created 26/12/2021 - 19:29
 * Average time-complexity is O(nlog n) but in worst case its O(n2). Space complexity  is less than Merge sort.
 * Quick sort may be preferred over Merge sort if the input size are huge as Merge sort uses extra array.
 */
public class QuickSort {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = {29, 7, 1, 32, 35, 74, 2, 11, 21, 414, 66, 6};
        quickSort.sort(arr, 0, arr.length - 1);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private void sort(int[] arr, int start, int end) {

        if(start < end){
            int pivot = partition(arr,start,end); /** Guarantees that all the element present at left are less than pivot index. Index od correctly placed value in array */
            sort(arr,start,pivot - 1); /** Sorts the left half of the range */
            sort(arr,pivot + 1 , end); /** Sorts the right half of the range */

        }

    }

    private int partition(int[] arr, int start, int end) {
        int pivot = end; /** Lets assume last element as pivot */
        int j = start; /** initialize j as start of any partition, left or right */
        int i = j - 1; /** i must start just before j */

        while (j <= end) {

            if (arr[j] <= arr[pivot]) {  /** if current element is less than element at pivot, increment first i then swap with j value */
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            j++;
        }

        return i;
    }
}
