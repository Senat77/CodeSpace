package com.alpha.PracticalWork26.work1;

import java.util.Scanner;

public class Runner {

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input int a :");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Input int b :");
        int b = sc.nextInt();
        System.out.println("Result : " + divisionInt(a, b));

        sc.nextLine();
        System.out.println("Input double a :");
        double dA = sc.nextDouble();
        sc.nextLine();
        System.out.println("Input double b :");
        double dB = sc.nextDouble();
        System.out.println("Result : " + divisionDouble(dA, dB));
    }

    private int divisionInt(int a, int b) {
        try {
            return Math.abs(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        }
        return -1;
    }

    private int divisionDouble(double a, double b) {
        if (b != 0)
            return (int)Math.abs(a / b);
        throw new ArithmeticException("Division by zero !");
    }
}
