package com.alpha.work1.PracticalWork22.work1;

public class MyCalculate {

    public static double calcPi(int iteration) {

        double pi = 0;

        while (iteration != 0) {
            double d = 4d / (iteration * 2 + 1);
            pi = (iteration % 2 == 1) ? pi + d : pi - d;
            iteration --;
        }

        return 4 - pi;
    }
}
