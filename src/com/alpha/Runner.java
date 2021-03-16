package com.alpha;

import com.alpha.work1.Book;

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

        Book book1 = new Book("New book", "Another autor");
        System.out.println(book1);
    }
}
