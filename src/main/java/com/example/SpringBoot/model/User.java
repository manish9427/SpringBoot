package com.example.SpringBoot.model;

import jakarta.persistence.*;
import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table(name = "users") // Table name in MySQL
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private static final Logger logger = LoggerFactory.getLogger(User.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, unique = true)
    private String username;


    @Column(nullable = false)
    private String password;


    @Column(nullable = false, unique = true)
    private String email;

    @PostPersist
    public void logUserCreation() {
        logger.info("New user created: {}", this);
    }
}
