package com.alpha.practicalwork34.work1;

public class MyTimeBomb_2 implements Runnable {

    @Override
    public void run() {
        for (int i = 10; i >= 0 ; i--) {
            System.out.println(i);
        }
        System.out.println("Boooooom!!!");
    }
}
