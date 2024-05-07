package com.exception.bookManagementSystem;

public class FictionBook extends Book{
    private String level;

    public FictionBook() {
    }

    public FictionBook(String name, String author, double price,
                       String ISBN, String level) throws ISBNIllegalException {
        super(name, author, price, ISBN);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "FictionBook{" + super.toString() +
                "level='" + level + '\'' +
                '}';
    }
}
