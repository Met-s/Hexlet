package io.hexlet.testsAutomaticTesting.implementations_5;

import java.util.List;
import java.util.ArrayList;

import io.hexlet.testsAutomaticTesting.Book_5;

public final class LibraryWrong2 implements Library {
    private List<Book_5> books = new ArrayList<>();

    @Override
    public boolean addBook(Book_5 book) {
        var isPresent = books.stream()
                .anyMatch(b -> b.getTitle().equals(book.getTitle()));

        if (isPresent) {
            throw new UnsupportedOperationException();
        }

        books.add(book);
        return true;
    }

    @Override
    public Book_5 findBook(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst()
                .orElse(null);

    }

    @Override
    public boolean removeBook(String title) {
        books.stream()
                .filter(book -> book.getTitle().equals(title))
                .findFirst()
                .ifPresent(book -> books.remove(book));

        return true;
    }
}

