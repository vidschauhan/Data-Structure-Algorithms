package com.popular.searchalgos;

import java.util.Arrays;

/**
 * @author vidit.singh
 * @created 26/12/2021 - 20:49
 */
public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] a = {29, 7, 55, 34, 23, 64, 21, 78, 99, 10, 41, 66, 6};
        bubbleSort.sort(a);
        Arrays.stream(a).forEach(System.out::println);
    }

    private void sort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) { /** This loop is just for passes. Time complexity O(n2). */
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
