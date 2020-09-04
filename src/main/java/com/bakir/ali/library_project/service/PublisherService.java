package com.bakir.ali.library_project.service;

import com.bakir.ali.library_project.model.Publisher;
import com.bakir.ali.library_project.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    public List<Publisher> getAllPublisher(){
        return publisherRepository.findAll();
    }

    public Publisher save(Publisher publisher){ return publisherRepository.save(publisher);}
}

