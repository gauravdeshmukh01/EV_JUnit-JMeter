package com.infosys;

import com.infosys.model.Employee;
import com.infosys.service.EmployeeService;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Valid Tests")
@Tag("valid")
public class ValidEmployeeServiceTest {

    private EmployeeService employeeService = new EmployeeService();

    @Test
    @DisplayName("Valid Yearly Salary Calculation")
    @Tag("salary")
    void validYearlySalary() {
        Employee e = new Employee(1, "Ram", 12000);
        assertEquals(144000, employeeService.calculateYearlySalary(e));
    }

    @Test
    @DisplayName("Valid Hike Calculation")
    @Tag("hike")
    void validHike() {
        Employee e = new Employee(2, "Anil", 9000);
        assertEquals(2000, employeeService.calculateHike(e));
    }
}
