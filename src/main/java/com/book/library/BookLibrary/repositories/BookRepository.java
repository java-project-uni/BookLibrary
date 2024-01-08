package com.book.library.BookLibrary.repositories;

import com.book.library.BookLibrary.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // Can add custom query methods if needed

    // Find a book by its name
    //Book findByName(String name);

    // Find a book by its ISBN
    //Book findByIsbn(String isbn);
}

