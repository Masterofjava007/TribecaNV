package com.example.demo.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImp implements IEmployeeService {



  @Autowired
  private IEmployeeRepo employeeRepo;

    @Override
    public List<Employee> fetchAllEmployees() {
       return employeeRepo.findAll();
    }

    @Override
    public Employee fetchEmployee(int id) {
        return employeeRepo.getOne(id);
    }

    @Override
    public void createEmployee(Employee e) {
      employeeRepo.save(e);
    }

    @Override
    public void deleteEmployee(Employee e) {
      employeeRepo.delete(e);
    }

    @Override
    public void updateEmployee(Employee e) {
      employeeRepo.save(e);
    }
}
