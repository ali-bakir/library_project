package com.bakir.ali.library_project.service;

import com.bakir.ali.library_project.model.Author;
import com.bakir.ali.library_project.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthor(){
        return authorRepository.findAll();
    }

    public Author save(Author author){
        return authorRepository.save(author);
    }
}
