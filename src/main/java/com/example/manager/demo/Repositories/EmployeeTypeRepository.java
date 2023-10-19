package com.example.manager.demo.Repositories;

import com.example.manager.demo.models.Employee;
import com.example.manager.demo.models.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType,Integer> {
}
