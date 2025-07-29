package org.example;

import org.example.Entity.Calculator;
import org.example.Service.CalculatorService;
import org.example.Service.CalculatorService2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class CalculatorTest {
    Calculator c = null;
    CalculatorService service = Mockito.mock(CalculatorService.class);

    @BeforeEach
    public void setup() {
        c = new Calculator(service);
    }

    @Test
    void testPerform() {
        when(service.divide(10, 0))
                .thenThrow(ArithmeticException.class);

        assertThrows(ArithmeticException.class,
                () -> service.divide(10, 0));
    }
}

