package org.example;

import org.example.Entity.Calculator1;
import org.example.Service.CalculatorService1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestcalculatorNewDay {

    Calculator1 c;

    @Mock
    CalculatorService1 service;

    @BeforeEach
    public void setUp() {
        c = new Calculator1(service);
    }

    @Test
    public void testPerform() {
        when(service.add(2, 3)).thenReturn(5);
        Assertions.assertEquals(5, c.perform(2, 3));
    }
}