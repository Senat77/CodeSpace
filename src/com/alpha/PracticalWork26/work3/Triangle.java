package com.alpha.PracticalWork26.work3;

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
        double a = Double.parseDouble(params.get(2));
        double b = Double.parseDouble(params.get(3));
        double c = Double.parseDouble(params.get(4));
        if (a + b < c || a + c < b || b + c < a || params.size() != 5)
            throw new InvalidShapeStringException("Triangle.parseTriangle : Invalid Shape String Exception");
        return new Triangle(params.get(1), a, b, c);
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
