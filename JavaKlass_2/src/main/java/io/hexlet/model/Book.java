package io.hexlet.model;
// №_2
public class Book {
    private String title;
    private String author;
    private int published;

    public Book(String title, String author, int published) {
        this.title = title;
        this.author = author;
        this.published = published;
    }

    @Override
    public String toString() {
        return "Book " + "\"" + title + "\"" + " written by " + author
                + " published in " + published;
    }

}
//=> Book "First Folio" written by William Shakespeare published in 1623