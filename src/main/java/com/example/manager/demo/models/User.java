package com.example.manager.demo.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = "username"),
        @UniqueConstraint(columnNames = "email")
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String password;
    private String email;
    @Enumerated(EnumType.STRING)
    private Role role;
}
