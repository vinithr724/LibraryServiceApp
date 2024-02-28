package com.CISProject.LibraryService.Service;
import com.CISProject.LibraryService.entity.LibraryBook;
import com.CISProject.LibraryService.model.Book;
import com.CISProject.LibraryService.model.BookIsbnDTO;
import com.CISProject.LibraryService.model.CheckoutDTO;
import com.CISProject.LibraryService.Repository.LibraryBookRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class BookService {
    //private Map<Long, Book> bookMap = new HashMap<>();
    @Autowired
    private LibraryBookRepository bookRepository;
    public LibraryBook createBook(LibraryBook book){

        // call the database
        //Integer bookId = new Random().nextInt();
        //book.setBookId(bookId);
        //bookMap.put(bookId, book);
        return  bookRepository.save(book);
    }

    public Book getBook(Integer bookId) {
        Optional<LibraryBook> bookOptional =
                bookRepository.findById(bookId);
        LibraryBook libraryBook =
                bookOptional.orElse(new LibraryBook());

        Book book = new Book();
        book.setBookId(libraryBook.getBookId());
        book.setTitle(libraryBook.getTitle());
        book.setAuthorName(libraryBook.getAuthorName());
        book.setYearPublished(libraryBook.getYearPublished());
        book.setQuantity(libraryBook.getQuantity());

        List<BookIsbnDTO> bookIsbnDTOS =
                libraryBook.getBookIsbns().stream().map(b -> {
                    BookIsbnDTO bdo = new BookIsbnDTO();
                    bdo.setIsbn(b.getIsbn());
                    bdo.setBookId(b.getBookId());
                    return bdo;
                }).collect(Collectors.toList());

        /*BookIsbnDTO bookIsbnDTO = new BookIsbnDTO();
        bookIsbnDTO.setBookIsbn(libraryBook.getBookIsbn().getIsbn());
        bookIsbnDTO.setBookId(libraryBook.getBookIsbn().getBookId());
*/
        book.setBookIsbns(bookIsbnDTOS);

        return book;
    }

    public LibraryBook updateBook(LibraryBook LibraryBook) {
        //Integer bookId = LibraryBook.getBookId();
        //bookMap.put(bookId, book);
        return bookRepository.save(LibraryBook);
    }

    public void deleteBook(Integer bookId) {
        bookRepository.deleteById(bookId);
    }
}
