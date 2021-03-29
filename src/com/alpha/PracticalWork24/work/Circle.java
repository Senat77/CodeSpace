package com.alpha.PracticalWork24.work;

public class Circle extends Shape {

    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
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
