package com.book.library.BookLibrary.controllers;

import com.book.library.BookLibrary.entities.Book;
import com.book.library.BookLibrary.services.BookService;
import com.book.library.BookLibrary.DTOs.BookDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/books")
public class BookController {
    final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<BookDTO>> getAllBooks() {
        List<BookDTO> books = bookService.getAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("getBook/{id}")
    public ResponseEntity<Optional<BookDTO>> getBookById(@PathVariable Long id) {
        Optional<BookDTO> book = bookService.getBookById(id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @PostMapping("/createBook")
    public ResponseEntity<BookDTO> createBook(@RequestBody BookDTO bookDTO) {
        BookDTO createdBook = bookService.createBook(bookDTO);
        return new ResponseEntity<>(createdBook, HttpStatus.CREATED);
    }

    @PutMapping("updateBook/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        Book updated = BookService.updateBook(id, updatedBook);
        if(updated != null){
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("deleteBook/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        BookService.deleteBook(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
