package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // by using this no need for static
public class ChangeDefaultInstanceTest {

    CalculationUtil cu;

    @BeforeAll
    public void beforeAllInit()
    {
        System.out.println("BeforeAll is executed");
    }

    @BeforeEach
    public void init()
    {
        System.out.println("---Before every test it will execute");
        cu = new CalculationUtil();
    }

    @AfterEach
    void cleanupCode()
    {
        System.out.println("Cleaning");
    }

    @AfterAll
    public void afterAllTests()
    {
        System.out.println("After all tests, All the test methods are executed");
    }

    // after commenting all above  go and add dependency surefire and in maven in test check all


    @Test// to make a method a test method,
    @DisplayName("SampleTest")
    void testShow(){
        System.out.println("Hello World");
    }

    // all the test cases run parallelly
    // by default for each test case there will be different instance
    @Test
    @DisplayName("Adding Test")
    void testAdd()
    {
        CalculationUtil cu = new CalculationUtil();
        int actual = cu.add(10, 20);
        int expected = 30;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Multiplying Test")
    void testMul()
    {
        CalculationUtil cu = new CalculationUtil();
        int actual = cu.mul(10, 20);
        int expected = 200;
        assertEquals(expected, actual);
    }

}
