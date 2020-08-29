package com.bakir.ali.library_project.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String book_name;
    private String book_subname;
    private String series_name;
    private int isbn_number;
    private String comment;

    @ManyToOne
    @JoinColumn(name = "author_id", name = "publisher_id")
    private Author author;
    private Publisher publisher;

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



