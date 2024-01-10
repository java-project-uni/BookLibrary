package com.book.library.BookLibrary.DTOs;

public class BookDTO {
    private String isbn;
    private String name;
    private String serialName;
    private String description;
    private String authorName;
    private String categoryName;
    private String publisherName;

    public BookDTO() {
    }

    public BookDTO(String isbn, String name, String serialName, String description, String authorName, String categoryName, String publisherName){
        this.isbn = isbn;
        this.name = name;
        this.serialName = serialName;
        this.description = description;
        this.authorName = authorName;
        this.categoryName = categoryName;
        this.publisherName = publisherName;
    }

    public String getIsbn() { return isbn; }

    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSerialName() { return serialName; }

    public void setSerialName(String serialName) { this.serialName = serialName; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String getAuthor() { return authorName; }

    public void setAuthor(String author) { this.authorName = author; }

    public String getCategory() { return categoryName; }

    public void setCategory(String category) { this.categoryName = category; }

    public String getPublisher() { return publisherName; }

    public void setPublisher(String publisher) { this.publisherName = publisher; }
}
