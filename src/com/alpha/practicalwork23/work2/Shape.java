package com.alpha.practicalwork23.work2;

public class Shape {

    private final String color;

    public Shape(String color) {
        this.color = color;
    }

    public double calcArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "class=" + getClass().getSimpleName() +
                ", color=" + color;
    }
}
