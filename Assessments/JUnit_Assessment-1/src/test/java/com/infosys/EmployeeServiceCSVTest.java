package com.infosys;

import com.infosys.model.Employee;
import com.infosys.service.EmployeeService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeServiceCSVTest {

    private EmployeeService employeeService = new EmployeeService();

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/EmployeeTest.csv", numLinesToSkip = 1)
    void testCalculateYearlySalaryWithCSV(int id, String name, double monthlySalary, double expectedYearly) {
        Employee employee = new Employee(id, name, monthlySalary);
        double actual = employeeService.calculateYearlySalary(employee);
        assertEquals(expectedYearly, actual);
    }
}
