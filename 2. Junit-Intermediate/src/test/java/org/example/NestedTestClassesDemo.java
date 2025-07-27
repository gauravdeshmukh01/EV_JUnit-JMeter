package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedTestClassesDemo {

    CalculationUtil cu;

    @BeforeEach
    void init(){

        cu = new CalculationUtil();
    }

    @Nested
    class AdditionTest {

        @Test
        @DisplayName("Addition Test for positive Values")
        void add_test_positive(){

            int actual = cu.add(10, 20);
            int expected = 30;
            Assertions.assertEquals(expected, actual, "Not equal");
        }

        @Test
        @DisplayName("Addition Test for negative Values")
        void add_test_negative(){
            int actual = cu.add(-10, -20);
            int expected = -30;
            Assertions.assertEquals(expected, actual, "Not equal");

        }
    }

    @Test
    @DisplayName("AssertAll in multiple test")
    void testMultiply() {
        int actual = cu.mul(0, 5);
        int actual2 = cu.mul(-2, -2);
        //  assertEquals(0, actual);
        //  assertEquals(4, actual2); // use 5 also
        assertAll(
                () -> assertEquals(0, cu.mul(0, 4)),
                () -> assertEquals(4, cu.mul(-2, -2)), // if 6 used in place of 4 then fail
                () -> assertEquals(-2, cu.mul(-2, 1))
        );

    }
}
