package com.alpha.PracticalWork26.work3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public void run() throws IOException {

        System.out.println(Shape.parseShape("Rectangle:RED:10,20"));
        System.out.println(Shape.parseShape("Circle:BLACK:10"));
        System.out.println(Shape.parseShape("Triangle:GREEN:9,7,12"));
        System.out.println(Shape.parseShape("Tri:GREEN:9,7,12"));

        System.out.println(Shape.parseShapeV2("Rectangle:RED:10,20"));
        System.out.println(Shape.parseShapeV2("Circle:BLACK:10"));
        System.out.println(Shape.parseShapeV2("Triangle:GREEN:9,7,12"));
        System.out.println(Shape.parseShapeV2("Tri:GREEN:9,7,12"));

        List<Shape> shapes = new ArrayList<>();
        while(true) {
            System.out.println("\nCreate figure ? (y/n)");
            int b = System.in.read();
            if((char)b == 'n')
                break;
            if((char)b == 'y') {
                System.out.println("Input figure signature :");
                Scanner sc = new Scanner(System.in);
                sc.nextLine();
                Shape shape = Shape.parseShapeV2(sc.nextLine());
                if(shape != null)
                 shapes.add(shape);
            }
        }

        printShapes(shapes);
    }

    private void printShapes(List<Shape> shapes) {
        shapes.forEach(System.out::println);
    }
}
