package com.book.library.BookLibrary.repositories;

import com.book.library.BookLibrary.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // Find a book by its name
    Book findByName(String name);

    // Find a book by its ISBN
    Optional<Book> findByIsbn(String isbn);
}

