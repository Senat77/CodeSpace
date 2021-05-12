package com.alpha.practicalwork34.work1;

public class Runner {

    public void run() {
        Thread thread1 = new MyTimeBomb_1();
        Runnable thread2 = new MyTimeBomb_2();
        thread1.start();
        thread2.run();
    }
}