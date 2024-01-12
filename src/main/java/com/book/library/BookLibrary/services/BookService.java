package com.book.library.BookLibrary.services;

import com.book.library.BookLibrary.DTOs.BookDTO;
import com.book.library.BookLibrary.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<BookDTO> getAllBooks();

    Optional<BookDTO> getBookByIsbn(String isbn);

    BookDTO createBook(BookDTO book);

    Book updateBook(Long id, BookDTO book);

    void deleteBook(Long id);

}
