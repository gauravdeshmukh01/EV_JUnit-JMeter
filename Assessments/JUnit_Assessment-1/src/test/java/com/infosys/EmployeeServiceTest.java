package com.infosys;

import com.infosys.model.Employee;
import com.infosys.service.EmployeeService;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Employee Service Test Suite")
public class EmployeeServiceTest {

    private EmployeeService employeeService;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All - Runs once before all tests");
    }

    @BeforeEach
    void setUp() {
        employeeService = new EmployeeService();
        System.out.println("Before Each - Creating EmployeeService instance");
    }

    @Test
    @Order(1)
    @DisplayName("Test Yearly Salary Calculation")
    void testCalculateYearlySalary() {
        Employee employee = new Employee(1, "Gaurav", 7000);
        double expected = 84000;
        double actual = employeeService.calculateYearlySalary(employee);
        assertEquals(expected, actual, "Yearly Salary should be monthlySalary * 12");
    }

    @Test
    @Order(2)
    @DisplayName("Test Hike Calculation for Low Salary")
    void testCalculateHike_LowSalary() {
        Employee employee = new Employee(2, "Gaurav", 7000);
        double expected = 2000;
        double actual = employeeService.calculateHike(employee);
        assertEquals(expected, actual, "Hike should be 2000 for salary below 10000");
    }

    @Test
    @Order(3)
    @Disabled("Disabled for demonstration")
    @DisplayName("Test Disabled Example")
    void testDisabledExample() {
        fail("This test should be disabled");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each - Destroying EmployeeService instance");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After All - Runs once after all tests");
    }
}
