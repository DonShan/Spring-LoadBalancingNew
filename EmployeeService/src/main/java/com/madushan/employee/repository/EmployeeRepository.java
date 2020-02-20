package com.madushan.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madushan.employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
