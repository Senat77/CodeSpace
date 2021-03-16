package com.alpha;

import com.alpha.work1.Book;

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
        try {
            System.out.println("Input percent, please : ");
            Scanner sc = new Scanner(System.in);
            float percent = sc.nextFloat();
            raiseThePrice(books, percent);
        }
        catch(Exception e) {
            System.out.println("Invalid entered value !");
        }
        print(books);
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
}
