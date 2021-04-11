package com.alpha.practicalwork28.work12;

import java.util.Arrays;
import java.util.Random;

public class Runner {

    public void run() {
        Random rand = new Random();

        Integer[] intArray = new Integer[rand.nextInt(10)];
        for(int i = 0; i < intArray.length; i++)
            intArray[i] = rand.nextInt(100);

        Double[] doubleArray = new Double[rand.nextInt(10)];
        for(int i = 0; i < doubleArray.length; i++)
            doubleArray[i] = rand.nextDouble() * 100;

        MyTestMethod method = new MyTestMethod();

        print(intArray);
        System.out.println("\ncalcNum = " + method.calcNum(intArray, 50));

        print(doubleArray);
        System.out.println("\ncalcNum = " + method.calcNum(doubleArray, 50.0));
    }

    private void print(Integer[] intArray) {
        System.out.println("\nInt array:");
        Arrays.stream(intArray).forEach(t -> System.out.print(t + " "));
    }

    private void print(Double[] doubleArray) {
        System.out.println("\nDouble array:");
        Arrays.stream(doubleArray).forEach(t -> System.out.printf("%.2f ", t));
    }
}
