package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppTest {

    CalculationUtil cu;

    @BeforeAll
    static void beforeAllInit()       // static no need of instance
    {
        System.out.println("BeforeAll is executed");
    }

    @BeforeEach
    void init()
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
    static void afterAllTests()  // static
    {
        System.out.println("After all tests, All the test methods are executed");
    }

    // after commenting all above  go and add dependency surefire and in maven in test check all


    @Test// to make a method a test method,
    @DisplayName("SampleTest")
    @Order(value = 5)
    void testShow(){
        System.out.println("Hello World");
    }

    // all the test cases run parallelly
    // by default for each test case there will be different instance


    @Test
    @Disabled
    void testFail(){
        Assertions.fail("This test will fail always");
    }

    @Test
    @Order(value = 2)
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
        assertEquals(expected, actual);
    }

    @Test
    void testDivException()
    {
        CalculationUtil cu = new CalculationUtil();
        Assertions.assertThrows(ArithmeticException.class,
                () -> cu.div(10, 0));
    }

    @Test
    @Order(value = 1)
    void testDivException1() {
        CalculationUtil cu = new CalculationUtil();
        Assertions.assertDoesNotThrow(() -> cu.div(10, 2), "Exception in code if divided by zero");
    }


    @Test
    @Order(value = 6)
    void testCompareObjects()
    {
//        String s1 = "Hi";
//        String s2 = "Hi";
//        Assertions.assertSame(s1, s2);
        String s3 = new String("Hi"); // heap memory
        String s4 = new String("Hi"); // heap memory
        //Assertions.assertSame(s3, s4); // reference
        assertEquals(s3, s4); // content

    }


    @Test
    @Order(value = 7)
    public void demoTest() {
        String str = "Info";
        assertEquals("Infosys", str.concat("sys"));
    }

// assertAll - it will be true if all cases are true, it is similar AND condition

    @Test
    @DisplayName("AssertAll in multiple test")
    @Order(value = 8)
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


    @RepeatedTest(3)
    @DisplayName("Repetition Test")
    @Order(value = 9)
    void myTest( RepetitionInfo repetitionInfo)
    {
        System.out.println(repetitionInfo.getCurrentRepetition());
        assertEquals( "Hi",  "Hi");
    }


}


