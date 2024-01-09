package com.book.library.BookLibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.book.library.BookLibrary.entities")
@ComponentScan("com.book.library.BookLibrary.*")
public class BookLibraryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookLibraryApiApplication.class, args);
	}
}
