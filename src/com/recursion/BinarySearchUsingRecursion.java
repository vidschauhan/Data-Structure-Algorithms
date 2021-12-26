package com.recursion;

/**
 * @author vidit.singh
 * @created 16/12/2021 - 20:33
 */
public class BinarySearchUsingRecursion {

    private int recursionLinearSearch(int[] arr, int start, int end, int data) {
        /** Assuming Array is sorted ! */
        int mid = (start + end) / 2;

        if (start > end ) /** Condition to terminate the recursion. Avoid stack overflow! Means start surpass the end but couldn't find the element. */
            return -1;

        if (arr[mid] == data) {
            return mid;
        } else if (arr[mid] > data) {
            end = mid - 1;
            return recursionLinearSearch(arr, start, end, data);
        } else {
            start = mid + 1;
            return recursionLinearSearch(arr, start, end, data);
        }

    }

    public static void main(String[] args) {
        BinarySearchUsingRecursion bs = new BinarySearchUsingRecursion();
        int[] arr =  {1,2,3,4,5,6,7,8,9,34,56,78,90,98};
        System.out.println(bs.recursionLinearSearch(arr,0,arr.length -1,99));
    }
}
