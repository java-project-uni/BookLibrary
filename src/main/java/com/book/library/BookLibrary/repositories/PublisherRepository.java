package com.book.library.BookLibrary.repositories;

import com.book.library.BookLibrary.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
