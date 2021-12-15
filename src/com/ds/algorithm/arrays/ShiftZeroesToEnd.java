package com.ds.algorithm.arrays;

import java.util.Arrays;

/**
 * @author vidit.singh
 * @created 30/11/2021 - 23:19
 */
public class ShiftZeroesToEnd {

        public static void main(String[] args) {
            int[] arr = {1,3,0,3,0,4,0,22,0,3,7};
            shiftZeroesToEnd(arr,arr.length);

        }


        public static void shiftZeroesToEnd(int[] array, int size) {
            int count = 0;
            for (int i = 0; i < size; i++) {
                if(array[i] !=0) {  /** Check if the current element is non zero place the element at [i], if 0 found then 'count' doesn't increase. */
                    array[count] = array[i];
                    count++; /** Count advances only if the non zero is placed at the current index.assuring all non zeroes shifted to first */
                }
            }

            while (count < size){ /** Run loop till size of the array to place the zeroes. */
                array[count] = 0;
                count++;
            }
            Arrays.stream(array).forEach(System.out::println);
        }

}
