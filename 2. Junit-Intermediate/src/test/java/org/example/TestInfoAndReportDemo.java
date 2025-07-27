package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInfoAndReportDemo {

    TestInfo testInfo;
    TestReporter testReporter;

    CalculationUtil cu;

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter) {

        this.testInfo = testInfo;
        this.testReporter = testReporter;
        cu = new CalculationUtil();

        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTestMethod());
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
    }

    @Test
    @DisplayName("Adding Test")
    @Tag("Valid")
    void testAdd()
    {
//        System.out.println(testInfo.getTestClass());
//        System.out.println(testInfo.getTestMethod());
//        System.out.println(testInfo.getDisplayName());
//        System.out.println(testInfo.getTags());

        CalculationUtil cu = new CalculationUtil();
        int actual = cu.add(10, 20);
        int expected = 30;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Multiplying Test")
    void testMul()
    {
//        testReporter.publishEntry("Running Test Class is\n" + testInfo.getTestClass()
//                + "and Test Method is\n" +  testInfo.getTestMethod()
//                + "and Display Name is\n" + testInfo.getDisplayName()
//                + "and Tag name is\n" + testInfo.getTags());

        CalculationUtil cu = new CalculationUtil();
        int actual = cu.mul(10, 20);
        int expected = 200;
        assertEquals(expected, actual);
    }
}
