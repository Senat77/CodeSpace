package com.alpha.PracticalWork26.work2;

import java.util.Scanner;

public class Runner {

    public void run() {
        Person person = new Person();

        Scanner sc = new Scanner(System.in);
        System.out.println("First name :");
        person.setFirstName(sc.nextLine());
        System.out.println("Last name :");
        person.setLastName(sc.nextLine());

        while(true) {
            try {
                System.out.println("Age :");
                person.setAge(sc.nextInt());
                break;
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(person);
    }
}
