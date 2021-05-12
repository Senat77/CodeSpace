package com.alpha.practicalwork34.work2;

import java.util.Arrays;
import java.util.Random;

public class Runner {

    public void run() throws InterruptedException {
        int[] array = createArray();
        Arrays.stream(array).forEach(t -> System.out.print(t + " "));

        MySumCount_1 thread1 = new MySumCount_1(20, 90, array);
        thread1.start();
        thread1.join();
        System.out.println("\nMySumCount_1 : " + thread1.getResultSum());

        MySumCount_2 runnable = new MySumCount_2(20, 90, array);
        Thread thread2 = new Thread(runnable);
        thread2.start();
        thread2.join();
        System.out.println("MySumCount_2 : " + runnable.getResultSum());
    }

    private int[] createArray() {
        return new Random().ints(1000, 0, 1000).toArray();
    }
}