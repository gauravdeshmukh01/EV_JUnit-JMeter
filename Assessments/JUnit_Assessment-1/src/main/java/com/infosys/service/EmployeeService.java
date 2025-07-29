package com.infosys.service;


import com.infosys.model.Employee;

public class EmployeeService {

    public double calculateYearlySalary(Employee employee) {
        return employee.getMonthlySalary() * 12;
    }

    public double calculateHike(Employee employee) {
        if (employee.getMonthlySalary() < 10000) {
            return 2000;
        } else {
            return 1000;
        }
    }
}
