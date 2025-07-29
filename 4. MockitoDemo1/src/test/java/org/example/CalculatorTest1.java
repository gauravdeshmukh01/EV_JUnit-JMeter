package org.example;

import org.example.Entity.Calculator1;
import org.example.Service.CalculatorService1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

public class CalculatorTest1 {

    Calculator1 c = null;
    CalculatorService1 service = Mockito.mock(CalculatorService1.class);

    @BeforeEach
    public void setUp() {
        c = new Calculator1(service);
    }

    @Test
    public void testPerform()
    {
        doNothing().when(service).add(0,0);
        c.perform(0,0);
        verify(service).add(0,0);

    }

}
