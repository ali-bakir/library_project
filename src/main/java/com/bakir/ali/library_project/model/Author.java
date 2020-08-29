package com.bakir.ali.library_project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String author_name;
    private String comment;

    public Author() {
    }

    public Author(String author_name, String comment) {
        this.author_name = author_name;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", author_name='" + author_name + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }


}
