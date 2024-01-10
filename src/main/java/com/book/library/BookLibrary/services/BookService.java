package com.book.library.BookLibrary.services;

import com.book.library.BookLibrary.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    static List<Book> getAllBooks() {
        return null;
    }

    static Optional<Book> getBookById() {
        return Optional.empty();
    }

    //List<Book> searchBooks(String keyword);

    static void createBook(Book book) {

    }

    static Book updateBook(Long id, Book book) {
        return null;
    }

    static void deleteBook(Long id) {

    }

}
