package com.example.manager.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public enum UserRole {
    ADMIN,
    CUSTOMER
}
