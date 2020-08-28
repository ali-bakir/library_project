package com.bakir.ali.library_project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String book_name;
    private String book_subname;
    private String series_name;
//    TODO: it must be primary key
    private String author;
//    TODO: it must be primary key
    private String publisher;
    private String isbn_number;
    private String comment;

    public Book() {
    }

    public Book(String book_name, String book_subname, String series_name, String author, String publisher,
                String isbn_number, String comment) {
        this.book_name = book_name;
        this.book_subname = book_subname;
        this.series_name = series_name;
        this.author = author;
        this.publisher = publisher;
        this.isbn_number = isbn_number;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getBook_subname() {
        return book_subname;
    }

    public String getSeries_name() {
        return series_name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn_number() {
        return isbn_number;
    }

    public String getComment() {
        return comment;
    }
}



