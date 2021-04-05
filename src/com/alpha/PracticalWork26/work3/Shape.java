package com.alpha.PracticalWork26.work3;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Shape implements Drawable, Comparable, Cloneable {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcArea();

    public static Shape parseShape(String signature){

        Shape shape = null;
        //Arrays.stream(signature.split("[:,]")).forEach(System.out::println);
        ArrayList<String> params = new ArrayList<> (Arrays.asList(signature.split("[:,]")));

        switch (params.get(0)) {
            case ("Rectangle") -> {
                shape = new Rectangle(params.get(1), Double.parseDouble(params.get(2)), Double.parseDouble(params.get(3)));
            }
            case ("Circle") -> {
                shape = new Circle(params.get(1), Double.parseDouble(params.get(2)));
            }
            case ("Triangle") -> {
                shape = new Triangle(params.get(1), Double.parseDouble(params.get(2)), Double.parseDouble(params.get(3)),
                        Double.parseDouble(params.get(4)));
            }
            default -> throw new InvalidShapeStringException("Invalid Shape String Exception");
        }
        return shape;
    }

    public static Shape parseShapeV2(String signature) {
        Shape shape = null;
        switch (signature.substring(0, signature.indexOf(":"))) {
            case ("Rectangle") -> {return Rectangle.parseRectangle(signature);}
            case ("Circle") -> {return Circle.parseCircle(signature);}
            case ("Triangle") -> {return Triangle.parseTriangle(signature);}
            default -> System.out.println("Illegal figure signature format");
        }
        return null;
    }

    @Override
    public String toString() {
        return "class=" + getClass().getSimpleName() +
                ", color=" + color;
    }

    @Override
    public void draw() {
        System.out.println(this.toString() + ", area=" + calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Shape s = (Shape) o;
        return Double.compare(calcArea(), s.calcArea());
    }
}
