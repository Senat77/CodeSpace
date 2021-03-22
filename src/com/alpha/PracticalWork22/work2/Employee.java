package com.alpha.work1.PracticalWork22.work2;

public class Employee {

    private static int numberOfEmployees = 0;

    private String firstName;
    private String lastName;
    private String occupation;
    private String telephone;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        numberOfEmployees++;
    }

    public Employee(String firstName, String lastName, String occupation, String telephone) {
        this(firstName, lastName);
        this.occupation = occupation;
        this.telephone = telephone;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", occupation='" + occupation + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}
