package com.example.manager.demo.Repositories;

import com.example.manager.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  UserRepository extends JpaRepository<User,Integer> {
}
