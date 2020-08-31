package com.bakir.ali.library_project.controller;

import com.bakir.ali.library_project.model.Publisher;
import com.bakir.ali.library_project.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("publishers")
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @GetMapping
    public ResponseEntity<Set<Publisher>> getAllPublisher(){
        return ResponseEntity.ok(publisherService.getAllPublisher());
    }

    @PostMapping
    public ResponseEntity<Publisher> savePublisher(@RequestBody Publisher publisher){
        return ResponseEntity.ok(publisherService.save(publisher));
    }
}
