package com.example.logger.learning.dao;
// This file is part of the learning application.
// It defines the PersonalAccount class, which represents a personal account with a name and email.
// It is used in the AccountManager controller to handle account-related operations.
// The class includes getters and setters for the name and email fields.

public class PersonalAccount {

    private String name;
    private String email;

    public PersonalAccount(String name, String email) {
        this.name = name;
        this.email = email;
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
}