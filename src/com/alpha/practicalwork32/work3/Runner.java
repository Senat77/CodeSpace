package com.alpha.practicalwork32.work3;

import java.io.*;
import java.util.Scanner;

public class Runner {

    public void run() throws IOException, ClassNotFoundException {

        User user = (User) createUser();

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ext_data.tmp"));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream("ext_data.tmp"))) {

            out.writeObject(user);

            user = null;
            User newUser;

            newUser = (User) in.readObject();
            System.out.println(newUser);
        }
    }

    private Object createUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first name : ");
        String firstName = sc.nextLine();
        System.out.println("Input last name : ");
        String lastName = sc.nextLine();
        System.out.println("Input age : ");
        int age = sc.nextInt();
        //TODO : check age > 0

        return new User(firstName, lastName, age);
    }
}