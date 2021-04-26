package com.alpha.practicalwork32.work2;

import java.io.*;
import java.util.Scanner;

public class Runner {

    public void run() throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first name : ");
        String firstName = sc.nextLine();
        System.out.println("Input last name : ");
        String lastName = sc.nextLine();
        System.out.println("Input age : ");
        int age = sc.nextInt();
        //TODO : check age > 0

        User user = new User(firstName, lastName, age);

        try (RandomAccessFile raf = new RandomAccessFile("user.tmp", "rws")) {
            raf.writeBytes(user.getFirstName() + '\n');
            raf.writeBytes(user.getLastName() + '\n');
            raf.write(user.getAge());

            user = null;
            User newUser = new User();

            raf.seek(0L);
            newUser.setFirstName(raf.readLine());
            newUser.setLastName(raf.readLine());
            newUser.setAge(raf.read());
            System.out.println(newUser);
        }
    }
}