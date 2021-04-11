package com.alpha.practicalwork25.work5;

import java.util.ArrayList;
import java.util.Arrays;

public class Circle extends Shape {

    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public static Circle parseCircle(String signature) {
        ArrayList<String> params = new ArrayList<> (Arrays.asList(signature.split("[:,]")));
        return new Circle(params.get(1), Double.parseDouble(params.get(2)));
    }

    @Override
    public double calcArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius=" + radius;
    }
}
