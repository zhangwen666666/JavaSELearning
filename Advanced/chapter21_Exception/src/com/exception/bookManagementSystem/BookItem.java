package com.exception.bookManagementSystem;

public class BookItem implements Lendable {
    private Book book;
    private Statue statue;

    public BookItem() {
    }

    public BookItem(Book book, Statue statue) {
        this.book = book;
        this.statue = statue;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Statue getStatue() {
        return statue;
    }

    public void setStatue(Statue statue) {
        this.statue = statue;
    }

    @Override
    public boolean lendBook() {
        if (this.statue == Statue.NOLEND) {
            this.statue = Statue.LEND;
            return true;
        }
        return false;
    }

    @Override
    public boolean returnBook() {
        if (this.statue == Statue.LEND){
            this.statue = Statue.NOLEND;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BookItem{" +
                "book=" + book +
                ", statue=" + statue +
                '}';
    }
}
