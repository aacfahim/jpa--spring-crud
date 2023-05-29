package com.aacfahim.JPACRUD.service;

import com.aacfahim.JPACRUD.model.Books;
import com.aacfahim.JPACRUD.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService {
    @Autowired
    BooksRepository booksRepository;

    public List<Books> getAllBooks(){
        List<Books> books = new ArrayList<>();
        booksRepository.findAll().forEach(bookItem -> books.add(bookItem));
        return books;
    }

    public Books getBooksById(int id){
        return booksRepository.findById(id).get();
    }

    public void saveOrUpdate(Books books){
        booksRepository.save(books);
        System.out.println("Operation Completed! " + books);
    }

    public void delete(int id){
        booksRepository.deleteById(id);
    }

    public void update(Books books, int bookId){
        booksRepository.save(books);
    }



}
