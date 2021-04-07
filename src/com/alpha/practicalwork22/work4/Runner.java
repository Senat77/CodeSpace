package com.alpha.work1.PracticalWork22.work4;

import com.alpha.work1.PracticalWork22.work4.calcarea.Calculate;

import java.util.Scanner;

public class Runner {

    public void run() {
        System.out.println("Площадь окружности : " + Calculate.areaCircle(inputCircleRadius()));
        System.out.println("Площадь квадрата : " + Calculate.areaSquare(inputSquareSide()));
    }

    private double inputCircleRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус окружности : ");
        return sc.nextDouble();
    }

    private int inputSquareSide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину стороны квадрата : ");
        return sc.nextInt();
    }
}
