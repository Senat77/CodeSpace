package com.alpha.work1.PracticalWork21;

import com.alpha.work1.PracticalWork21.Book;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {

    void run () {
        Book book = new Book();
        System.out.println(book);
        book.setId(1);
        book.setAuthor("Unknown");
        book.setCost(44.99f);
        book.setCountPages(413);
        book.setName("Great book");
        book.setPublish("Morgan & Morgan");
        book.setYear(1977);
        System.out.println(book);

        Book book1 = new Book("New book", "Another author");
        System.out.println(book1);

        System.out.println("\n*** 1-4-2 ***");
        Book[] books = create();
        print(books);

        System.out.println("\n*** 1-4-4");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input percent, please : ");
        if (sc.hasNextFloat()) {
            float percent = sc.nextFloat();
            raiseThePrice(books, percent);
            print(books);
        }
        else
            System.out.println("Invalid entered value !");

        System.out.println("\n*** 1-5-1 ***");
        String author;
        String publish;
        int minYear;

        sc.nextLine();
        System.out.println("Input author name, please : ");
        author = sc.nextLine();
        print(findByAuthor(books, author));


        System.out.println("Input publishing house, please : ");
        if (sc.hasNext()) {
            publish = sc.nextLine();
            print(findByPublish(books, publish));
        }

        System.out.println("Input year, please : ");
        if (sc.hasNextInt()) {
            minYear = sc.nextInt();
            print(findByMinYear(books, minYear));
        }
        else
            System.out.println("Invalid entered value !");

        sc.close();
    }

    // 1-4-1
    private Book[] create() {
        return new Book[] {
          new Book(4, "Name4", "Author4", "Publish1", 1990, 400, 4.44f),
          new Book(5, "Name5", "Author5", "Publish1", 1991, 400, 5.55f),
          new Book(6, "Name6", "Author4", "Publish2", 1992, 400, 6.66f),
          new Book(7, "Name7", "Author6", "Publish3", 1993, 400, 7.77f),
          new Book(8, "Name8", "Author5", "Publish1", 1991, 400, 8f),
          new Book(9, "Name9", "Author4", "Publish4", 1992, 400, 9f),
          new Book(10, "Name10", "Author7", "Publish6", 1993, 400, 10f)
        };
    }

    // 1-4-2
    private void print(Book[] books) {
        Arrays.stream(books).forEach(System.out::println);
    }

    // 1-4-3
    private void raiseThePrice(Book[] books, float percent) {
        Arrays.stream(books).forEach((t) -> t.setCost(t.getCost() + t.getCost() / 100f * percent));
    }

    // 1-5-1
    private Book[] findByAuthor (Book[] books, String author) {
        return Arrays.stream(books).filter((t) -> t.getAuthor().equals(author)).toArray(Book[]::new);
    }

    private Book[] findByPublish(Book[] books, String publish) {
        return Arrays.stream(books).filter((t) -> t.getPublish().equals(publish)).toArray(Book[]::new);
    }

    private Book[] findByMinYear(Book[] books, int year) {
        return Arrays.stream(books).filter((t) -> t.getYear() >= year).toArray(Book[]::new);
    }
}
