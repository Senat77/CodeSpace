package com.alpha.practicalwork29.work3;

import java.io.IOException;
import java.util.Scanner;

public class Runner {

    public void run() throws IOException {

        MyTranslator translator = new MyTranslator();

        while (true) {
            System.out.println("Create new word ? (y/n)");
            int b = System.in.read();
            if ((char) b == 'n')
                break;
            if ((char) b == 'y')
                inputWord(translator);
        }

        System.in.read();
        System.out.println("Dictionary : " + translator.getDict());

        while (true) {
            System.out.println("Translate phrase ? (y/n)");
            int b = System.in.read();
            if ((char) b == 'n')
                break;
            if ((char) b == 'y')
                System.out.println(translator.translate(inputPhrase()));
        }
    }

    private void inputWord(MyTranslator translator) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("Input EN word :");
        String en = sc.nextLine();
        System.out.println("Input RU word : ");
        String ru = sc.nextLine();
        translator.addWords(en, ru);
    }

    private String inputPhrase() {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("\nInput phrase :");
        return sc.nextLine();
    }
}