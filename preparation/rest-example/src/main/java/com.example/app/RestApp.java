/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author spoun
 */
@SpringBootConfiguration
@ComponentScan(basePackages = "com.example")
public class RestApp {
    public static void main(String[] args) {
        SpringApplication.run(RestApp.class, args);
    }
}
