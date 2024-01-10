package com.book.library.BookLibrary.DTOs;

public class BookDTO {
    private String isbn;
    private String name;
    private String serialName;
    private String description;
    private AuthorDTO author;
    private CategoryDTO category;
    private PublisherDTO publisher;

    public BookDTO() {
    }

    public BookDTO(String isbn, String name, String serialName, String description, AuthorDTO author, CategoryDTO category, PublisherDTO publisher){
        this.isbn = isbn;
        this.name = name;
        this.serialName = serialName;
        this.description = description;
        this.author = author;
        this.category = category;
        this.publisher = publisher;
    }

    public String getIsbn() { return isbn; }

    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSerialName() { return serialName; }

    public void setSerialName(String serialName) { this.serialName = serialName; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public AuthorDTO getAuthor() { return author; }

    public void setAuthor(AuthorDTO author) { this.author = author; }

    public CategoryDTO getCategory() { return category; }

    public void setCategory(CategoryDTO category) { this.category = category; }

    public PublisherDTO getPublisher() { return publisher; }

    public void setPublisher(PublisherDTO publisher) { this.publisher = publisher; }
}
