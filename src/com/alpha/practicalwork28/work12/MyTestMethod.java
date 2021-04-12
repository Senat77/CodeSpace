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

    public<T extends Number & Comparable> double calcSum(T[] array, T maxValue) {
        double res = 0.0;
        for (T t : array) {
            if(t.compareTo(maxValue) > 0)
                res += t.doubleValue();
        }
        return res;
    }
}
