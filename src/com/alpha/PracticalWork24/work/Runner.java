package com.alpha.PracticalWork24.work;

import java.util.Arrays;

public class Runner {

    public void run() {

        Shape[] shapes = createShapesDim();

        System.out.println("=== PRINT ===");
        printShapes(shapes);

        System.out.println("\n\n === NEW PRINT ===");
        newPrintShapes(shapes);

        Shape r1 = new Rectangle("white", 2, 2);
        Shape r2 = new Rectangle("black", 3, 3);
        System.out.println("\n" + r1.compareTo(r2));
        System.out.println(r2.compareTo(r1));

        System.out.println("\nSort By Area :");
        Arrays.stream(shapes).sorted().forEach(Shape::draw);

        System.out.println("\nSort By Color :");
        Arrays.stream(shapes).sorted(new MyComparatorColor()).forEach(Shape::draw);

        System.out.println("\nClone :");
        Shape newRectangle = shapes[0].clone();
    };

    private Shape[] createShapesDim() {
        return new Shape[] {
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
    }

    private void printShapes(Shape[] shapes) {
        Arrays.stream(shapes).forEach(shape -> System.out.println(shape + " ,area=" + shape.calcArea()));
    }

    private void newPrintShapes(Shape[] shapes) {
        Arrays.stream(shapes).forEach(t -> t.draw());
    }
}
