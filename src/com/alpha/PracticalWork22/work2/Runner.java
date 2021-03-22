package com.alpha.work1.PracticalWork22.work2;

import com.alpha.work1.PracticalWork22.work1.MyCalculate;

import java.util.Scanner;

public class Runner {

    public void run() {
        Employee[] employees = {
           new Employee("Ivan", "Ivanov"),
           new Employee("Peter", "Petrov"),
           new Employee("Sidor", "Sidorov", "teacher", "222-232"),
           new Employee("Margarita", "Margaritova", "director", "111-11-11")
        } ;

        System.out.println("Number of employees : " + Employee.getNumberOfEmployees());
    }
}
