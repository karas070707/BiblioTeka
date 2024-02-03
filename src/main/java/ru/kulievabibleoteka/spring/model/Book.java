package ru.kulievabibleoteka.spring.model;

public class Book {
    private int bookId;
    private String name;
    private String author ;
    private int date;

    public Book(int bookId, String name, String author, int date) {
        this.name = name;
        this.author = author;
        this.date = date;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
