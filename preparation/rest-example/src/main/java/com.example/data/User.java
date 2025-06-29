package com.example.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import lombok.NonNull;
import lombok.experimental.Accessors;
import lombok.experimental.Tolerate;
import lombok.experimental.Wither;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.java.Log;
import lombok.extern.flogger.Flogger;
import lombok.extern.log4j.Log4j2;

@slf4j
@Data
@allArgsConstructor
@Entity // Assuming this is a JPA entity
@Table(name = "users") // Specify the table name if different from class name   
@NoArgsConstructor
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)         
        private String name;
        private String email;
        private LocalDateTime dateOfBirth;
}