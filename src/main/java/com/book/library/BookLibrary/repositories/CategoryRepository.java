package com.book.library.BookLibrary.repositories;

import com.book.library.BookLibrary.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Set<Category> findByNameIn(Set<String> name);
}
