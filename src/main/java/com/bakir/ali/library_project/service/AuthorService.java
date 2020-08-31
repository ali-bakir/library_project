package com.bakir.ali.library_project.service;

import com.bakir.ali.library_project.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AuthorService<AuthorRepository> {

    @Autowired
    private AuthorRepository authorReporsitory;

    public Set<Author> getAllAuthor(){
        return (Set<Author>)authorReporsitory.findAll();
    }

    public Author save(Author author){
        return authorReporsitory.save(author);
    }
}
