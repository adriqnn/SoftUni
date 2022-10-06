package com.example.springdataautomappingobjects.repositories;

import com.example.springdataautomappingobjects.entities.Employee;
import com.example.springdataautomappingobjects.entities.dto.EmployeeSpringDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<EmployeeSpringDTO> findByBirthdayBeforeOrderBySalaryDesc(LocalDate beforeYear);
}
