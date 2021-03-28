package com.alpha.PracticalWork23.work2;

public class Runner {

    public void run() {

        Shape[] shapes = {
                new Rectangle("white", 3, 4),
                new Circle("purple", 3.3),
                new Rectangle("black", 5, 2.2),
                new Triangle("brown", 2, 2.1, 2.2),
                new Rectangle("yellow", 3.1, 1),
                new Circle("grey", 4.4),
                new Triangle("blue", 3.5, 3.6, 3.7),
                new Rectangle("green", 1.77, 2.9),
                new Circle("red", 2)
        };

        print(shapes);
    }

    public void print(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.toString() + " ,area=" + shape.calcArea());
        }
    }
}
