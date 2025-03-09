package io.hexlet.model;
//№_11
public class BookS {

    private String title;
    private String authorName;
    private String genre;

    public BookS(String title, String authorName, String genre) {
        this.title = title;
        this.authorName = authorName;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getGenre() {
        return genre;
    }
}
