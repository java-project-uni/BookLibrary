package com.book.library.BookLibrary.controllers;

import com.book.library.BookLibrary.entities.Book;
import com.book.library.BookLibrary.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(BookService.getAllBooks(), HttpStatus.OK);
    }

    @GetMapping("getBook/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return BookService.getBookById().map(book -> new ResponseEntity<>(book, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/addBook")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        BookService.createBook(book);
        return new ResponseEntity<>(HttpStatus.CREATED);
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
