package com.CISProject.LibraryService.model;
import lombok.Data;

import java.util.List;

@Data
public class Book {
    private int bookId;
    private String authorName;
    private String title;
    private int yearPublished;
    private int quantity;
    private List<BookIsbnDTO> bookIsbns;

    /*private Integer bookId;
    private String author;
    private String publisher;
    private int yearOfPublish;

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYearOfPublish(Integer yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public Integer getBookId() {
        return bookId;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public Integer getYearOfPublish() {
        return yearOfPublish;
    }*/
}