package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionTest {

    @Test
    @Tag("Success")
    void testDivException1() {
        CalculationUtil cu = new CalculationUtil();
        Assertions.assertDoesNotThrow(() -> cu.div(10, 2), "Exception in code if divided by zero");
    }
}
