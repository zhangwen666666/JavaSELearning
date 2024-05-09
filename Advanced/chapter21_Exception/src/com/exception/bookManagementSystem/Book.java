package com.exception.bookManagementSystem;

import java.util.Objects;

abstract public class Book {
    private String name;
    private String author;
    private double price;
    private String ISBN;

    public Book() {
    }

    public Book(String name, String author, double price, String ISBN) throws ISBNIllegalException {
        this.name = name;
        this.author = author;
        this.price = price;
        if(isISBNLegal(ISBN))
            this.ISBN = ISBN;
        else
            throw new ISBNIllegalException("ISBN非法");
    }

    private static boolean isISBNLegal(String ISBN) {
        return ISBN.matches("\\d{3}-\\d{1}-\\d{3}-\\d{5}-\\d{1}");
        /*
        System.out.println(ISBN.matches("\\d{3}-\\d{1}-\\d{3}-\\d{5}-\\d{1}"));
        if (ISBN.length() != 17) return false;
        for (int i = 0; i < ISBN.length(); i++) {
            char temp = ISBN.charAt(i);
            if (i == 3 || i == 5 | i == 9 || i == 15) {
                if (temp != '-') return false;
            } else {
                if (temp > '9' || temp < '0') return false;
            }
        }
        return true;
         */
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return this.ISBN.equals(book.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }
}
