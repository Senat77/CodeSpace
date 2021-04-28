package com.alpha.practicalwork32.work1;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private String address;
    static private int SSN;
    private int number;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void setSSN(int ssn) {
        SSN = ssn;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", SSN=" + SSN +
                ", number=" + number +
                '}';
    }
}
