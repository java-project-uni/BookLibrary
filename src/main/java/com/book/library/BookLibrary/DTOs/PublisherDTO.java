package com.book.library.BookLibrary.DTOs;

import java.util.List;

public class PublisherDTO {

    private Long id;

    private String name;

    private List<PublisherDTO> publishers;

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

    public List<PublisherDTO> getPublishers() {
        return publishers;
    }

    public void setPublishers(List<PublisherDTO> publishers) {
        this.publishers = publishers;
    }


}
