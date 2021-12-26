package com.recursion;

import com.popular.searchalgos.LinearSearch;

/**
 * @author vidit.singh
 * @created 16/12/2021 - 20:17
 */
public class LinearSearchUsingRecursion {

    public int recursionLinearSearch(int[] arr,int limit,int data){
        if(limit >= 0)
        {
            if(arr[limit] == data)
                return limit;
            else
                return recursionLinearSearch(arr,limit - 1,data);
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearchUsingRecursion ls = new LinearSearchUsingRecursion();
        int[] arr =  {23,43,5,23,56,88,4,23,42};
        System.out.println(ls.recursionLinearSearch(arr,arr.length-1,43));
    }
}
