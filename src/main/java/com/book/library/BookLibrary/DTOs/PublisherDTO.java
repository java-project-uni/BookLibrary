package com.book.library.BookLibrary.DTOs;

public class PublisherDTO {
    private String name;

    public PublisherDTO()
    {

    }

    public PublisherDTO(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
