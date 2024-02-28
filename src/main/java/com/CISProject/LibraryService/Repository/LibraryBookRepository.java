package com.CISProject.LibraryService.Repository;

import com.CISProject.LibraryService.entity.LibraryBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryBookRepository extends JpaRepository<LibraryBook, Integer> {

}