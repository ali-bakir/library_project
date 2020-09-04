package com.bakir.ali.library_project.controller;

import com.bakir.ali.library_project.model.Book;
import com.bakir.ali.library_project.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> getAllBook() {
        return ResponseEntity.ok(bookService.getAllBook());
    }

    @PostMapping
    public ResponseEntity<Book> saveBook(@RequestBody Book book) {
        return ResponseEntity.ok(bookService.save(book))
                ;
    }
}
