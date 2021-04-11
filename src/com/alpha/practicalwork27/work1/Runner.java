package com.alpha.practicalwork27.work1;

public class Runner {

    public void run() {
        MyPhoneBook myPhoneBook = new MyPhoneBook();
        myPhoneBook.addPhoneNumber("Ivan", "222-232");
        myPhoneBook.addPhoneNumber("Svetlana", "334-23-23");
        myPhoneBook.addPhoneNumber("Igor", "555-55-55");
        myPhoneBook.addPhoneNumber("Unknown", "0");
        myPhoneBook.addPhoneNumber("Peter", "123-45-67");
        myPhoneBook.addPhoneNumber("Serg", "999-99-09");

        myPhoneBook.printPhoneBook();
    }
}
