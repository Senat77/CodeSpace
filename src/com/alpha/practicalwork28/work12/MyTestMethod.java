package com.alpha.practicalwork28.work12;

public class MyTestMethod {

    public<T extends Comparable> int calcNum(T[] array, T maxValue) {
        int count = 0;
        for(T t : array) {
            if(t.compareTo(maxValue) > 0)
                count++;
        }
        return count;
    }
}
