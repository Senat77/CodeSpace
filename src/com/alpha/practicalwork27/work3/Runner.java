package com.alpha.practicalwork27.work3;

public class Runner {

    public void run() {
        MyPhone phone = new MyPhone();
        phone.switchOn();

        phone.call(2);
        phone.call(8);

        phone.addCamera("Model A");

        phone.printInfo();

        phone.addMemoryCard(10);

        phone.printInfo();
    }
}
