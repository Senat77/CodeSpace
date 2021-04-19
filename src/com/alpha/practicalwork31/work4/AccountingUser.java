package com.alpha.practicalwork31.work4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class AccountingUser {

    private RandomAccessFile file;

    public AccountingUser() {
        try {
            this.file = new RandomAccessFile("users.txt", "rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addUser(String user) {

    }

    public void printFile() {
        try {
            file.seek(0L);
            while(file.getFilePointer() < file.length()) {
                System.out.println(file.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
