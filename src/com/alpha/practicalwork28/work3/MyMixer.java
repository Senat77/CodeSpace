package com.alpha.practicalwork28.work3;

import java.util.Random;

public class MyMixer <T> {

    private final T[] array;

    public MyMixer(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void shuffle() {
        Random rand = new Random();
        for(int i = 0; i < array.length; i++) {
            int index = rand.nextInt(array.length);
            T temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
