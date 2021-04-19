package com.alpha.practicalwork31.work3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public void run() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("From (file name) :");
        String oldPath = sc.nextLine();
        System.out.println("To (file name) :");
        String newPath = sc.nextLine();

        if (!Files.exists(Path.of(oldPath))) {
            System.out.println("Неверный путь исходного файла!");
            return;
        }

        if (Files.isDirectory(Path.of(oldPath))) {
            System.out.println("Указанный путь не является файлом !");
        }

        copyFiles(oldPath, newPath);

        replacementInFile(newPath);
    }

    private void copyFiles(String oldFile, String newFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(oldFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
                System.out.println("Copy file  ...");
                while (br.ready()) {
                    bw.write(br.readLine());
                    bw.newLine();
                }
                System.out.println("Copy ended");
             } catch (IOException e) {
                e.printStackTrace();
        }
    }

    private void replacementInFile(String filename) {
        List<String> array = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while (br.ready()) {
                String str = br.readLine().replaceAll("public", "protected");
                array.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for(String str : array) {
                bw.write(str);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}