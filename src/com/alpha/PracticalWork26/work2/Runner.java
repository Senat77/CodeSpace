package com.alpha.PracticalWork26.work2;

import java.util.Scanner;

public class Runner {

    public void run() throws InvalidAgeException {
        Person person = new Person();

        Scanner sc = new Scanner(System.in);
        System.out.println("First name :");
        person.setFirstName(sc.nextLine());
        System.out.println("Last name :");
        person.setLastName(sc.nextLine());
        System.out.println("Age :");
        person.setAge(sc.nextInt());

        System.out.println(person);
    }
}
