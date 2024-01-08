package com.book.library.BookLibrary;

import com.book.library.BookLibrary.controllers.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EntityScan("com.book.library.BookLibrary.entities")
@ComponentScan("com.book.library.BookLibrary.*")
@Import({SwaggerConfig.class, BookController.class, SecurityConfig.class})
@EnableWebMvc
public class BookLibraryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookLibraryApiApplication.class, args);
	}

}
