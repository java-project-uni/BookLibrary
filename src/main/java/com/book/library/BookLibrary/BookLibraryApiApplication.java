package com.book.library.BookLibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.book.library.BookLibrary.entities.Author;
import com.book.library.BookLibrary.entities.Book;
import com.book.library.BookLibrary.entities.Category;
import com.book.library.BookLibrary.entities.Publisher;
import com.book.library.BookLibrary.entities.Role;
import com.book.library.BookLibrary.entities.User;

@SpringBootApplication
@EntityScan("com.book.library.BookLibrary.entities")
public class BookLibraryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookLibraryApiApplication.class, args);
	}

}
