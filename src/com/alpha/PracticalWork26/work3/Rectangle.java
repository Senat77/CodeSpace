package com.alpha.PracticalWork26.work3;

import java.util.ArrayList;
import java.util.Arrays;

public class Rectangle extends Shape {

    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public static Rectangle parseRectangle(String signature) {
        ArrayList<String> params = new ArrayList<> (Arrays.asList(signature.split("[:,]")));
        double a = Double.parseDouble(params.get(2));
        double b = Double.parseDouble(params.get(3));
        if (a <= 0 || b <= 0 || params.size() != 4)
            throw new InvalidShapeStringException("Rectangle.parseRectangle : Invalid Shape String Exception");
        return new Rectangle(params.get(1), a, b);
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() + ", width=" + width + ", height=" + height;
    }
}
