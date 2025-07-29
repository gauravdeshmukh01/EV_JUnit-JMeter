package com.infosys;

import com.infosys.model.Employee;
import com.infosys.service.EmployeeService;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Employee Service Invalid Output Tests")
@Tag("invalid")
public class InvalidEmployeeServiceTest {

    private EmployeeService employeeService = new EmployeeService();

    @Test
    @DisplayName("Verify Yearly Salary is Not an Incorrect Value (e.g., 100000)")
    @Tag("salary")
    void invalidYearlySalary() {
        Employee e = new Employee(1, "Aman", 5000);
        assertNotEquals(100000, employeeService.calculateYearlySalary(e),
                "Yearly Salary should not be 100000 for monthly 5000");
    }

    @Test
    @DisplayName("Verify Hike is Not an Incorrect Value (e.g., 2000 for high salary)")
    @Tag("hike")
    void invalidHike() {
        Employee e = new Employee(2, "Dipak", 12000);
        assertNotEquals(2000, employeeService.calculateHike(e),
                "Hike should not be 2000 for monthly salary 12000 (should be 1000)");
    }
}