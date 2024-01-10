package com.book.library.BookLibrary.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import com.book.library.BookLibrary.DTOs.BookDTO;
import com.book.library.BookLibrary.entities.Book;
import com.book.library.BookLibrary.DTOs.PublisherDTO;
import com.book.library.BookLibrary.entities.Publisher;
import com.book.library.BookLibrary.DTOs.CategoryDTO;
import com.book.library.BookLibrary.entities.Category;
import com.book.library.BookLibrary.DTOs.AuthorDTO;
import com.book.library.BookLibrary.entities.Author;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class Mapper {

    public final ModelMapper modelMapper;

    public Mapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public List<BookDTO> mapBooks(List<Book> books) {
        return books.stream()
                .map(book -> modelMapper.map(book, BookDTO.class))
                .collect(Collectors.toList());
    }

    public Set<AuthorDTO> mapAuthors(Set<Author> authors) {
        return authors.stream()
                .map(author -> modelMapper.map(author, AuthorDTO.class))
                .collect(Collectors.toSet());
    }

    public Set<CategoryDTO> mapCategories(Set<Category> categories) {
        return categories.stream()
                .map(category -> modelMapper.map(category, CategoryDTO.class))
                .collect(Collectors.toSet());
    }

    public Set<PublisherDTO> mapPublishers(Set<Publisher> publishers) {
        return publishers.stream()
                .map(publisher -> modelMapper.map(publisher, PublisherDTO.class))
                .collect(Collectors.toSet());
    }
}
