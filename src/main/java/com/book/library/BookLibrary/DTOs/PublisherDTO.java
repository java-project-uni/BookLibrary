package com.book.library.BookLibrary.DTOs;

import com.book.library.BookLibrary.entities.Book;

import java.util.List;

public class PublisherDTO {

    private Long id;

    private String name;

    private List<BookDTO> books;

    public PublisherDTO()
    {
    }

    public PublisherDTO(String name)
    {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BookDTO> getBooks() {
        return books;
    }

    public void setBooks(List<BookDTO> books) {
        this.books = books;
    }


}
