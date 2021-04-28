package com.alpha.practicalwork33.work1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Runner {

    public void run() {
        Integer[] arrInt = createArrayInt();
        Arrays.sort(arrInt);
        System.out.println(Arrays.toString(arrInt));
        //Arrays.sort(arrInt, (a, b) -> b.compareTo(a));
        Arrays.sort(arrInt, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arrInt));
    }

    private Integer[] createArrayInt() {
        Random random = new Random();
        Integer[] array = new Integer[20];
        for(int i = 0; i < 20; i++)
            array[i] = random.nextInt(100) - 50;
        return array;
    }

    private List<String> createStringList() {
        Random random = new Random();
        List<String> = new ArraysL
        for (int i = 0; i < 12; i++) {

        }
    }
}