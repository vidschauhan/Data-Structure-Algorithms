package com.ds.algorithm.adt;

/**
 * @author vidit.singh
 * @created 29/11/2021 - 16:32
 */
public class Counter {
    /**
     * Abstract Data types
     */
    private String name;
    private int counter;

    public Counter(String str) {
        this.name = str;
    }

    public void increment(){
        counter++;
    }
    public int getCurrentValue(){
        return counter;
    }

    @Override
    public String toString() {
        return name + " : " + counter;
    }

}
