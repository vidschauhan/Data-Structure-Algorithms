package com.popular.searchalgos;

/**
 * @author vidit.singh
 * @created 16/12/2021 - 11:33
 */
public class LinearSearch {
    public int linearSearchData(int[] arr, int data){
        if(arr.length < 1)
            return -1;

        for (int i =0; i<arr.length;i++){
            if(arr[i] == data)
                return i;
        }
        return -1;

    }

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int[] arr = {2,4,6,8,9,3,22,45,78,99,01,41,66,277};
        System.out.println(linearSearch.linearSearchData(arr,277));
    }
}
