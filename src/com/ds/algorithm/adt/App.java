package com.ds.algorithm.adt;

/**
 * @author vidit.singh
 * @created 29/11/2021 - 16:39
 */
public class App {

    public static void main(String[] args) {
        Counter  myCounter = new Counter("New Data");
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        System.out.println(myCounter.getCurrentValue());
    }


}
