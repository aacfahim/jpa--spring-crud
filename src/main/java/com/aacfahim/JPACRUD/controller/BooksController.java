package com.aacfahim.JPACRUD.controller;
import com.aacfahim.JPACRUD.model.Books;
import com.aacfahim.JPACRUD.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    BooksService booksService;

    @GetMapping("/book")
    private List<Books> getAllBooks(){
        return booksService.getAllBooks();
    }

    @GetMapping("/book/{bookId}")
    private Books getBook(@PathVariable("bookId") int bookId){
        return booksService.getBooksById(bookId);
    }

    @DeleteMapping("/book/{bookId}")
    private void deleteBook(@PathVariable("bookId") int bookId){
        booksService.delete(bookId);
    }

    @PostMapping("/books")
    private int saveBook(@RequestBody Books books){
        booksService.saveOrUpdate(books);
        return books.getBookId();
    }

    @PutMapping("/books")
    private int update(@RequestBody Books books){
        booksService.saveOrUpdate(books);
        return books.getBookId();
    }

}
