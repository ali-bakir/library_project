package com.bakir.ali.library_project.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    @JsonIgnore
    private String password;
    private String firstName;
    private String lastName;

    @Email
    @Column(nullable = false)
    private String email;

    private String imageUrl;

    @Column(nullable = false)
    private Boolean emailVerified = false;

    @NotNull
    @Enumerated(EnumType.STRING)
    private AuthProvider provider;

    private String providerId;

    public User() {
    }

    public User(String username, String password, String firstName, String lastName, AuthProvider provider) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.provider = provider;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public String getProvider() {
        return provider.name();
    }

    public void setProvider(AuthProvider valueOf) {
        this.provider = valueOf;
    }

    public void setProviderId(String id) {
        this.providerId = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmail() {
    }

    public void setfirstName(Object name) {
    }

    public void setPassword(Object password) {
    }
}
