package com.bakir.ali.library_project.controller;

import com.bakir.ali.library_project.model.Author;
import com.bakir.ali.library_project.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public ResponseEntity<List<Author>> getAllAuthor() {
        return ResponseEntity.ok(authorService.getAllAuthor());
    }

    @PostMapping
    public ResponseEntity<Author> saveAuthor(@RequestBody Author author) {
        return ResponseEntity.ok(authorService.save(author));
    }
}
