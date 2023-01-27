package com.hicounselor.BookReview.model;

class Book {
    private String name;
    private String author;
    private int rating;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getRating() {
        return rating;
    }

    Book(String name, String author, int rating) {
        this.name = name;
        this.author = author;
        this.rating = rating;
    }

}