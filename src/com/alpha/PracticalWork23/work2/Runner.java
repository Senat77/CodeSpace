package com.alpha.PracticalWork23.work2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

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

        System.out.println("\nCommon area = " + calcCommonArea(shapes));

        System.out.println("\nCommon areas by type : " + calcCommonAreaByShapeTypes(shapes));
    }

    private void print(Shape[] shapes) {
        Arrays.stream(shapes).map(shape -> shape.toString() + " ,area=" + shape.calcArea()).forEach(System.out::println);
    }

    private double calcCommonArea(Shape[] shapes) {
        return Arrays.stream(shapes).mapToDouble(Shape::calcArea).sum();
    }

    private Map<String,Double> calcCommonAreaByShapeTypes(Shape[] shapes) {
        Map<String, Double> map = new HashMap<>();
        Arrays.stream(shapes).forEach(shape -> {
            String type = shape.getClass().getSimpleName();
            map.put(type, map.containsKey(type) ? map.get(type) + shape.calcArea() : shape.calcArea());
        });
        return map;
    }
}
