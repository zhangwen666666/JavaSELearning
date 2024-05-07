package com.exception.bookManagementSystem;

public class NonFictionBook extends Book{
    private String topic;

    public NonFictionBook() {
    }

    public NonFictionBook(String name, String author, double price,
                          String ISBN, String topic) throws ISBNIllegalException {
        super(name, author, price, ISBN);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "NonFictionBook{" + super.toString() +
                "topic='" + topic + '\'' +
                '}';
    }
}
