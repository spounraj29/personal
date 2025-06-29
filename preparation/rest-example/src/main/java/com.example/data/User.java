package com.example.data;

import java.time.LocalDateTime;

public class User {
        private Long id;       
        private String name;
        private String email;
        private LocalDateTime dateOfBirth;

    public User() {
    }

    public User(LocalDateTime dateOfBirth, String email, Long id, String name) {
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}