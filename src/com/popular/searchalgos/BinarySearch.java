package com.popular.searchalgos;

/**
 * @author vidit.singh
 * @created 16/12/2021 - 12:18
 */
public class BinarySearch {
    /** Note : Condition -> The Data must be sorted. */
    public int binarySearch(int[] arr, int data) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;

            if (arr[mid] == data)
                return mid;

            if (arr[mid] > data) {
                /** If data at mid is greater than desired data It means the data should be present on the left side
                 * Hence shift the end to new point to narrow the search range. i.e before mid. */
                end = mid - 1;
            } else {
                start = mid + 1; /** Vice versa of above condition */
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {1,23,26,34,38,41,45,48,56,78,87,89,95};
        System.out.println(bs.binarySearch(arr,0));
    }
}
