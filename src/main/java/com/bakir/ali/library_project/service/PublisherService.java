package com.bakir.ali.library_project.service;

import com.bakir.ali.library_project.model.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PublisherService<PublisherRepository> {

    @Autowired
    private PublisherRepository publisherRepository;

    public Set<Publisher> getAllPublisher(){
        return (Set<Publisher>)publisherRepository.findAll();
    }

    public Publisher save(Book book){

        return publisherRepository.save(book);
    }
}

