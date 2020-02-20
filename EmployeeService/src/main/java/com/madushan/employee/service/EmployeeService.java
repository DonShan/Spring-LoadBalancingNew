package com.madushan.employee.service;

import java.util.Optional;

import com.madushan.employee.model.Employee;

public interface EmployeeService {

    Employee save(Employee employee);

    Optional<Employee> findByID(int employeeID);

    Employee fetchAllFromEmployee(int employeeID);

}
