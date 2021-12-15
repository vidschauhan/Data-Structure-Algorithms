package com.algo.practice;

/**
 * @author vidit.singh
 * @created 09/12/2021 - 20:15
 * Level - HARD
 */
public class MinimumWindowSubString {
    /**
     * Q. Given is String `S` and a String `T`, find the minimum window in S which will contain all the character in T
     * in complexity O(n).
     * Input : S = "ADBHSHDKSBANC", T = "ABC".
     * OUTPUT : "BANC"
     *
     * Input : S = "ABCDEAFGHIJK", T = "JA".
     * OUTPUT : "AFGHIJ" */
    public static String getSubstring(String Input, String Target){

        for (int i = 0; i < Input.length(); i++) {

        }
        return null;
    }


    public static void main(String[] args) {
        String Input = "ADBHSHDKSBANC";
        String Target = "ABC";

        System.out.println(getSubstring(Input,Target));

    }
}
