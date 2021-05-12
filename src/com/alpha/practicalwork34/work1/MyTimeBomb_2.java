package com.alpha.practicalwork34.work1;

import java.util.Random;

public class MyTimeBomb_2 implements Runnable {

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 10; i >= 0 ; i--) {
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getClass().getSimpleName() + " " + i);
        }
        System.out.println("Boooooom!!!");
    }
}
