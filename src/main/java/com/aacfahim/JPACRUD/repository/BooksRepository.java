package com.aacfahim.JPACRUD.repository;

import com.aacfahim.JPACRUD.model.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends CrudRepository<Books, Integer> {
}
