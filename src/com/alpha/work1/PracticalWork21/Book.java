package com.alpha.work1.PracticalWork21;

public class Book {

    private int id;
    private String name;
    private String author;
    private String publish;
    private int year;
    private int countPages;
    private float cost;

    public Book() {}

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(int id, String name, String author, String publish, int year, int countPages, float cost) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publish = publish;
        this.year = year;
        this.countPages = countPages;
        this.cost = cost;
    }

    public int getId() { return id;}
    public void setId(int id) { this.id = id;}
    public String getName() { return name;}
    public void setName(String name) { this.name = name;}
    public String getAuthor() { return author;}
    public void setAuthor(String author) { this.author = author;}
    public String getPublish() { return publish;}
    public void setPublish(String publish) { this.publish = publish;}
    public int getYear() { return year;}
    public void setYear(int year) { this.year = year;}
    public int getCountPages() { return countPages;}
    public void setCountPages(int countPages) { this.countPages = countPages;}
    public float getCost() { return cost;}
    public void setCost(float cost) { this.cost = cost;}

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                ", year=" + year +
                ", countPages=" + countPages +
                ", cost=" + String.format("%.2f", cost) +
                '}';
    }
}
