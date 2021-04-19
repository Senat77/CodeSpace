package com.alpha.practicalwork29.work2;

public class Runner {

    public void run() {

        MyNumGenerator generator = new MyNumGenerator(15, 4);
        System.out.println(generator.generateList());
        System.out.println(generator.generateSet());
    }
}
