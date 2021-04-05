package com.alpha.PracticalWork25.work5;

import java.util.ArrayList;
import java.util.Arrays;

public class Triangle extends Shape {

    private final double a;
    private final double b;
    private final double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static Triangle parseTriangle(String signature) {
        ArrayList<String> params = new ArrayList<> (Arrays.asList(signature.split("[:,]")));
        return new Triangle(params.get(1), Double.parseDouble(params.get(2)), Double.parseDouble(params.get(3)),
                Double.parseDouble(params.get(4)));
    }

    @Override
    public double calcArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return super.toString() + ", a=" + a + ", b=" + b + ", c=" + c;
    }
}
