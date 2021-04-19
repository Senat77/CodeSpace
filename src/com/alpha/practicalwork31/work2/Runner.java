package com.alpha.practicalwork31.work2;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Runner {

    public void run(String fileName) {
        Path path = Path.of(fileName);
        if(!Files.exists(path)) {
            System.out.println("Неверный путь!");
            return;
        }

        try {
            FileInputStream fis = new FileInputStream(fileName);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            System.out.println(new String(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}