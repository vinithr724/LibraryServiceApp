package com.CISProject.LibraryService.model;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class BookIsbnDTO {
    private long isbn;
    private int bookId;
}