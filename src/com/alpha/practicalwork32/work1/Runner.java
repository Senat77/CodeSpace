package com.alpha.practicalwork32.work1;

import java.io.*;

public class Runner {

    public void run() throws IOException, ClassNotFoundException {
        Employee employee = new Employee();
        employee.setName("Ivan");
        employee.setAddress("Address");
        Employee.setSSN(123456);
        employee.setNumber(654321);
        System.out.println(employee);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ext_data.tmp"))) {
            out.writeObject(employee);
        }

        employee = null;
        Employee.setSSN(123123);
        Employee newEmployee;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("ext_data.tmp"))) {
            newEmployee = (Employee) in.readObject();
        }

        System.out.println(newEmployee);
    }
}