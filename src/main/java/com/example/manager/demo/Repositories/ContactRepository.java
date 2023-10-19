package com.example.manager.demo.Repositories;

import com.example.manager.demo.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Client, Integer> {
}
