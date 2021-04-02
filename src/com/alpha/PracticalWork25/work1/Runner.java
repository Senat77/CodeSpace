package com.alpha.PracticalWork25.work1;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {

    public void run() {

        System.out.println("Days of week:");
        Arrays.stream(DaysOfWeek.values()).forEach(System.out::println);

        System.out.println("\nStudy days:");
        Arrays.stream(DaysOfWeek.values())
                .filter(t -> t.ordinal() % 2 == 1)
                .forEach(System.out::println);

        System.out.println("\nInput day of week:");
        Scanner sn = new Scanner(System.in);
        System.out.println(DaysOfWeek.valueOf(sn.nextLine().toUpperCase()).nextDay());
    };
}
