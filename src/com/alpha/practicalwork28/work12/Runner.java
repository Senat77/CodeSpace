package com.alpha.practicalwork28.work12;

import java.util.Arrays;
import java.util.Random;

public class Runner {

    public void run() {

        Integer[] intArray = createIntArray();

        Double[] doubleArray = createDoubleArray();

        MyTestMethod method = new MyTestMethod();

        print(intArray);
        System.out.println("\ncalcNum = " + method.calcNum(intArray, 50));
        System.out.println("calcSum = " + method.calcSum(intArray, 50));

        print(doubleArray);
        System.out.println("\ncalcNum = " + method.calcNum(doubleArray, 50.0));
        System.out.printf("calcSum = %.2f", method.calcSum(doubleArray, 50.0));
    }

    private <T> void print (T[] tArray) {
        String clazz = tArray.getClass().getSimpleName();
        System.out.println("\n" + clazz.substring(0, clazz.length() - 2) + " array:");
        Arrays.stream(tArray).forEach(t -> System.out.print(t + " "));
    }

    private Integer[] createIntArray() {
        Random rand = new Random();
        Integer[] intArray = new Integer[rand.nextInt(10)];
        for(int i = 0; i < intArray.length; i++)
            intArray[i] = rand.nextInt(100);
        return intArray;
    }

    private Double[] createDoubleArray() {
        Random rand = new Random();
        Double[] doubleArray = new Double[rand.nextInt(10)];
        for(int i = 0; i < doubleArray.length; i++)
            doubleArray[i] = rand.nextDouble() * 100;
        return doubleArray;
    }
}
