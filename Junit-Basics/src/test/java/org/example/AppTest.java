package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AppTest {

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
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Multiplying Test")
    void testMul()
    {
        CalculationUtil cu = new CalculationUtil();
        int actual = cu.mul(10, 20);
        int expected = 200;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @Disabled
    void testFail(){
        Assertions.fail("This test will fail always");
    }

    @Test
    void testNullString()
    {
        CalculationUtil cu = new CalculationUtil();
       String input = "1234";
       // String input = null;

        String result = cu.parseString(input);
        Assertions.assertNotNull(result);
    }

    @Test
    @DisplayName("Division Test")
    void testDiv()
    {
        CalculationUtil cu = new CalculationUtil();
        int actual = cu.div(10, 2);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDivException()
    {
        CalculationUtil cu = new CalculationUtil();
        Assertions.assertThrows(ArithmeticException.class,
                () -> cu.div(10, 0));
    }

    @Test
    void testDivException1() {
        CalculationUtil cu = new CalculationUtil();
        Assertions.assertDoesNotThrow(() -> cu.div(10, 2), "Exception in code if divided by zero");
    }


    @Test
    void testCompareObjects()
    {
//        String s1 = "Hi";
//        String s2 = "Hi";
//        Assertions.assertSame(s1, s2);
        String s3 = new String("Hi"); // heap memory
        String s4 = new String("Hi"); // heap memory
        //Assertions.assertSame(s3, s4); // reference
        Assertions.assertEquals(s3, s4); // content

    }

}


