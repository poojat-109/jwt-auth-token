package com.example.JwtAuthenticationExample.service;

import com.example.JwtAuthenticationExample.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    public List<Employee> getEmployeeList(){

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(UUID.randomUUID().toString(), "John", "john@gmail.com"));
        employeeList.add(new Employee(UUID.randomUUID().toString(), "Nathu", "nathu@gmail.com"));
        return employeeList;
    }

}
