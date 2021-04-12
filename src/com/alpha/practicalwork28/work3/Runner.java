package com.alpha.practicalwork28.work3;

import java.util.Arrays;
import java.util.Random;

public class Runner {

    public void run() {

        Integer[] intArray = createIntArray();
        print(intArray);
        MyMixer<Integer> intMixer = new MyMixer<>(intArray);
        intMixer.shuffle();
        print(intMixer.getArray());

        String[] stringArray = createStringArray();
        print(stringArray);
        MyMixer<String> stringMixer = new MyMixer<>(stringArray);
        stringMixer.shuffle();
        print(stringMixer.getArray());
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

    private String[] createStringArray() {
        Random rand = new Random();
        String[] stringArray = new String[rand.nextInt(5)];
        for(int i = 0; i < stringArray.length; i++)
            stringArray[i] = String.valueOf(rand.nextLong());
        return stringArray;
    }
}
