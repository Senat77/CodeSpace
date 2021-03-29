package com.alpha.PracticalWork24.work;

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
