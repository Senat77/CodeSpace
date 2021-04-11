package com.alpha.practicalwork27.work12;

public class Runner {

    public void run() {
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("Ivan", "522-232");
        myPhoneBook.addPhoneNumber("Svetlana", "334-23-23");
        myPhoneBook.addPhoneNumber("Ivan", "555-55-55");
        myPhoneBook.addPhoneNumber("Unknown", "0");
        myPhoneBook.addPhoneNumber("Svetlana", "123-45-67");
        myPhoneBook.addPhoneNumber("Sergey", "999-99-09");

        System.out.println("\nUnsorted:");
        myPhoneBook.printPhoneBook();

        System.out.println("\nSort by name:");
        myPhoneBook.sortByName();
        myPhoneBook.printPhoneBook();

        System.out.println("\nSort by phone:");
        myPhoneBook.sortByPhoneNumber();
        myPhoneBook.printPhoneBook();

        System.out.println("\nSort by name and phone:");
        myPhoneBook.sortByNameAndPhone();
        myPhoneBook.printPhoneBook();
    }
}
