package com.madushan.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.madushan.employee.model.Employee;
import com.madushan.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class Employee {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/employeeJSON")
    public List<Employee> getAllEmployees() {
        return Employee.getAllEmployees();
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public Employee saveData(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @RequestMapping("/employee/id/{employeeID}")
    public Optional<Employee> findByID(@PathVariable int employeeID) {
        return employeeService.findByID(employeeID);
    }

    @RequestMapping("/employee/{employeeID}")
    public Employee fetchAllByID(@PathVariable int employeeID) {
        return employeeService.fetchAllFromEmployee(employeeID);
    }

}
