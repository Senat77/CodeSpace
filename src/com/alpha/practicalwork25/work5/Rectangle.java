package com.alpha.practicalwork25.work5;

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
        return new Rectangle(params.get(1), Double.parseDouble(params.get(2)), Double.parseDouble(params.get(3)));
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
