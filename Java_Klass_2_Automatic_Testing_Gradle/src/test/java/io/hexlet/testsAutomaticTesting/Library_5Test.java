package io.hexlet.testsAutomaticTesting;

import io.hexlet.testsAutomaticTesting.implementations_5.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static io.hexlet.testsAutomaticTesting.Libraries_5.makeLibrary;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class Library_5Test {
// ###_____ Решение Учителя ____###
    private Library library;

    @BeforeEach
    public void setupLibrary() {
        library = makeLibrary();
        library.addBook(new Book_5("Law Abiding Citizen", "Lawton MacParlan"));
        library.addBook(new Book_5("Aliens", "Tye Brighouse"));
        library.addBook(new Book_5("Seduced and Abandoned", "Mercy Blackborough"));
        library.addBook(new Book_5("Law and Order", "Mano Kinloch"));
    }


    @Test
    public void testAddBook() {
        var addedBook = new Book_5("Gold", "Mano Kinloch");
        assertTrue(library.addBook(addedBook));

        var actualBook = library.findBook(addedBook.getTitle());
        assertNotNull(actualBook);
        assertEquals(actualBook, addedBook);

        var existingBook = new Book_5("Law and Order", "Mano Kinloch");
        assertThrows(UnsupportedOperationException.class, () -> library.addBook(existingBook));
    }

    @Test
    public void testRemoveBook() {
        var bookTitleToRemove = "Aliens";
        assertTrue(library.removeBook(bookTitleToRemove));
        assertNull(library.findBook(bookTitleToRemove));

        assertThrows(NoSuchElementException.class, () -> library.removeBook("Not existing"));
    }

    @Test
    public void testFindBook() {
        var existingBook = new Book_5("Aliens", "Tye Brighouse");
        var actualBook = library.findBook(existingBook.getTitle());
        assertEquals(existingBook, actualBook);

        var notExistingTitle = "Law";
        assertNull(library.findBook(notExistingTitle));
    }
// ###_____ Решение ____###
//    private Library library = makeLibrary();
//
//    @Test
//    public void makeLibraryTest() {
//        assertNotNull(library);
//    }
//
//    @BeforeEach
//    public void beforeEach() {
//        library.addBook(new Book_5("Aliens",
//                "Tye Brighouse"));
//    }
//
//    @Test
//    public void addBookTest() {
//        assertTrue(library.addBook(new Book_5(
//                "Law Abiding Citizen","Lawton MacParlan")));
//    }
//
//    @Test
//    public void findBookTest() {
//        var actual = library.findBook("Aliens");
//        Book_5 expected = new Book_5("Aliens", "Tye Brighouse");
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void bookExceptionTest() {
//        assertThrows(NoSuchElementException.class,
//                () -> library.removeBook("No existed"));
//    }
//
//    @Test
//    public void addBookExceptionTest() {
//        assertThrows(UnsupportedOperationException.class,
//                () -> library.addBook(
//                        new Book_5("Aliens",
//                                "Tye Brighouse")));
//    }
//
//    @Test
//    public void removeBookTest() {
//        library.removeBook("Aliens");
//        var actual = library.findBook("Aliens");
//        assertNull(actual);
//    }
}
