package com.example.JwtAuthenticationExample.controller;


import com.example.JwtAuthenticationExample.model.Employee;
import com.example.JwtAuthenticationExample.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/welcome")
@AllArgsConstructor
public class HomeController {

    private final EmployeeService employeeService;

    @GetMapping("/employee")
    private List<Employee> getEmpList(){

        return employeeService.getEmployeeList();

    }

}
