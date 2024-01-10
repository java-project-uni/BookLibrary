package com.book.library.BookLibrary.services;

import com.book.library.BookLibrary.DTOs.BookDTO;
import com.book.library.BookLibrary.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<BookDTO> getAllBooks();

    Optional<BookDTO> getBookById(Long id);

    BookDTO createBook(BookDTO book);

    static Book updateBook(Long id, Book book) {
        return null;
    }

    static void deleteBook(Long id) {

    }

}
