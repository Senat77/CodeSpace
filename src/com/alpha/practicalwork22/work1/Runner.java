package com.alpha.practicalwork22.work1;

import java.util.Scanner;

public class Runner {

    public void run() {
        System.out.println(MyCalculate.calcPi(inputInt()));
    }

    private int inputInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положмтельное число : ");
        int i = sc.nextInt();
        sc.close();
        return i;
    }
}
