package io.hexlet.testsAutomaticTesting.implementations_5;

import io.hexlet.testsAutomaticTesting.Book_5;

public interface Library {
    boolean addBook(Book_5 book);
    Book_5 findBook(String name);
    boolean removeBook(String name);
}
