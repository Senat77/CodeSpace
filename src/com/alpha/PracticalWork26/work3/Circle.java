package com.alpha.PracticalWork26.work3;

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
        double radius = Double.parseDouble(params.get(2));
        if(params.size() != 3 || radius <= 0)
            throw new InvalidShapeStringException("Circle.parseCircle : Invalid Shape String Exception");
        return new Circle(params.get(1), radius);
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
