package com.bakir.ali.library_project.service;

import com.bakir.ali.library_project.model.Book;
import com.bakir.ali.library_project.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Set<Book> getAllBook(){
        return (Set<Book>)bookRepository.findAll();
    }

    public Book save(Book book){
        return bookRepository.save(book);
    }
}
