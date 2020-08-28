package com.bakir.ali.library_project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String publisher;
    private String comment;

    public Publisher() {
    }

    public Publisher(String publisher, String comment) {
        this.publisher = publisher;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisher='" + publisher + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
