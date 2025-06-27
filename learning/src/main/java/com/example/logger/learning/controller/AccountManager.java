package com.example.logger.learning.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountManager {

    @GetMapping("/account/{name}")
    public String getAccount(
            @PathVariable String name,
            @RequestParam(required = false) String email    
    ) {
        if (name.equals("invalid")) {
            throw new IllegalArgumentException("Invalid account name provided");
        }   
        return "Account details of Mr."+ name;
    }

    @PostMapping("/account")
    public String createAccount() {
        return "Account created";
    }

    @PutMapping("/account")
    public String updateAccount() {
        return "Account updated";
    }

    @DeleteMapping("/account")
    public String deleteAccount() {
        return "Account deleted";
    }
}   

