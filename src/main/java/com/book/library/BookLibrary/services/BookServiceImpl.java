package com.book.library.BookLibrary.services;

import com.book.library.BookLibrary.entities.Book;
import com.book.library.BookLibrary.repositories.BookRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import com.book.library.BookLibrary.Mapper.Mapper;
import com.book.library.BookLibrary.DTOs.BookDTO;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private Mapper mapper;

    public void BookServiceImpl(BookRepository bookRepository, Mapper mapper) {
        this.bookRepository = bookRepository;
        this.mapper = mapper;
    }

    public List<BookDTO> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        return mapper.mapBooks(books);
    }

    public Optional<BookDTO> getBookById(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        BookDTO bookDTO = mapper.modelMapper.map(book, BookDTO.class);
        return Optional.ofNullable(bookDTO);
    }

    public BookDTO createBook(BookDTO book) {
        Book bookToSave = mapper.modelMapper.map(book, Book.class);

       /* Author author = authorRepository.findByName(book.getAuthor().getName());
        if (author == null) {
        }
        bookToSave.getAuthors().add(author);

        Category category = categoryRepository.findByName(book.getCategory().getName());
        if (category == null) {
        }
        bookToSave.getCategories().add(category);

        Publisher publisher = publisherRepository.findByName(book.getPublisher().getName());
        if (publisher == null) {

        }
        bookToSave.getPublishers().add(publisher);*/

        Book savedBook = bookRepository.save(bookToSave);

        return mapper.modelMapper.map(savedBook, BookDTO.class);
    }

    Book updateBook(Long id, Book book) {
        Book existingBook = bookRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);

        existingBook.setIsbn(book.getIsbn());
        existingBook.setName(book.getName());
        existingBook.setSerialName(book.getSerialName());
        existingBook.setDescription(book.getDescription());

        existingBook.setAuthors(book.getAuthors());
        existingBook.setCategories(book.getCategories());
        existingBook.setPublishers(book.getPublishers());

        return bookRepository.save(existingBook);
    }

    void deleteBook(Long id) throws ChangeSetPersister.NotFoundException {
        var book = bookRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);

        bookRepository.deleteById(book.getId());
    }

}
