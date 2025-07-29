
package org.example;

import org.example.Entity.Calculator2;
import org.example.Service.CalculatorService2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach; // Make sure this import is present
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalculatorTest2 {

    CalculatorService2 calculatorService2 = Mockito.mock(CalculatorService2.class);

    Calculator2 calculator2 = null;

    @BeforeEach
    void setUp() {
        calculator2 = new Calculator2(calculatorService2);
        System.out.println("Setting up the Calculator instance for testing.");
    }

    @Test
    void testAdd() {
        int a = 5;
        int b = 10;
        int expectedSum = 15;

        Mockito.when(calculatorService2.add(a, b)).thenReturn(expectedSum);

        int result = calculator2.add(a, b);
        Assertions.assertEquals(expectedSum, result);
    }

    @Test
    void subtract() {
        int a = 5;
        int b = 10;
        int expected = -5;

        Mockito.when(calculatorService2.subtract(a, b)).thenReturn(expected);

        int actual = calculator2.subtract(a, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        int a = 5;
        int b = 10;
        int expectedProduct = 50;

        Mockito.when(calculatorService2.multiply(a, b)).thenReturn(expectedProduct);

        int result = calculator2.multiply(a, b);

        Assertions.assertEquals(expectedProduct, result);
    }

    @Test
    void testDivide() {
        int a = 10;
        int b = 2;

        double expectedResult = 5.0;

        Mockito.when(calculatorService2.divide(a, b)).thenReturn(expectedResult);

        double result = calculator2.divide(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void testPerform() {

        Mockito.when(calculatorService2.divide(10, 0))
                .thenThrow(ArithmeticException.class);

        Assertions.assertThrows(ArithmeticException.class,
                () -> calculator2.divide(10, 0));
    }
}