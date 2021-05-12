package com.alpha.practicalwork34.work1;

public class Runner {

    public void run() {
        Thread thread1 = new MyTimeBomb_1();
        Runnable runnable = new MyTimeBomb_2();
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}