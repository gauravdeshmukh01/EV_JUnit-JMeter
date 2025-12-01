package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTest {
    @Test
    @Tag("Slow")
    @Tag("Failure")
    void multiplicationTest() {
        CalculationUtil cu = new CalculationUtil();
        int actual = cu.mul(10,  2);
        int expected = 20;
        assertEquals(expected, actual);
    }
}
