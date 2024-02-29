package com.CISProject.LibraryService.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table(name="book")
@Entity
@Data
public class LibraryBook {
    @Id
    @Column(name="book_id")
    private Integer bookId;

    @Column(name="title")
    private String title;

    @Column(name="author_name")
    private String authorName;

    @Column(name="year_published")
    private Integer yearPublished;

    @Column(name="quantity")
    private Integer quantity;

    @OneToMany(mappedBy = "libraryBook", cascade = CascadeType.ALL)
    private List<BookIsbn> bookIsbns;
}