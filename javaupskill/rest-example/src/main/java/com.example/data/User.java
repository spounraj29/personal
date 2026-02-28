package com.example.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDateTime;

/**
 * A simple JPA entity representing a user in the system.  Lombok annotations
 * generate boilerplate such as getters/setters, constructors and a builder.
 */
@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    /**
     * Database primary key; generated automatically.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Full name of the user.
     */
    private String name;

    /**
     * Contact email address.
     */
    private String email;

    /**
     * Birth date or registration timestamp.
     */
    private LocalDateTime dateOfBirth;
}