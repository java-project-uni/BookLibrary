package com.book.library.BookLibrary.services;

import com.book.library.BookLibrary.entities.Book;
import com.book.library.BookLibrary.repositories.BookRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;
import java.util.Optional;

public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    //List<Book> searchBooks(String keyword);

    void createBook(Book book) {
        bookRepository.save(book);
    }

    Book updateBook(Long id, Book book) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            Book existingBook = optionalBook.get();

            existingBook.setName(book.getName());
            existingBook.setSerialName(book.getSerialName());
            existingBook.setDescription(book.getDescription());

            existingBook.setAuthors(book.getAuthors());
            existingBook.setCategories(book.getCategories());
            existingBook.setPublishers(book.getPublishers());

            return bookRepository.save(existingBook);
        } else {
            throw new EntityNotFoundException();
        }
    }

    void deleteBook(Long id) throws ChangeSetPersister.NotFoundException {
        var book = bookRepository.findById(id)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);

        bookRepository.deleteById(book.getId());
    }

}
