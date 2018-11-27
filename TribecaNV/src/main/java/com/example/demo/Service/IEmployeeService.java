package com.example.demo.Service;

import com.example.demo.Model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> fetchAllEmployees();
    Employee fetchEmployee (int id);
    void createEmployee (Employee e);
    void deleteEmployee (Employee e);
    void updateEmployee (Employee e);
}
