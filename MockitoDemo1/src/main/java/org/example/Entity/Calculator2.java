//package org.example.Entity;
//
//import org.example.Service.CalculatorService;
//import org.example.Service.CalculatorService2;
//
//public class Calculator2 {
//    CalculatorService2 calculatorService2;
//
//    public Calculator2(CalculatorService calculatorService) {
//    }
//
//    public int add(int a, int b) {
//        return calculatorService2.add(a, b);
//    }
//    public int subtract(int a, int b) {
//        return calculatorService2.subtract(a, b);
//    }
//    public int multiply(int a, int b) {
//        return calculatorService2.multiply(a, b);
//    }
//    public double divide(int a, int b) throws ArithmeticException {
//        return calculatorService2.divide(a, b);
//    }
//}
package org.example.Entity;

// Make sure you import both services if they both exist and are relevant
import org.example.Service.CalculatorService;
import org.example.Service.CalculatorService2; // This is the one you want to use internally

public class Calculator2 {
    CalculatorService2 calculatorService2; // This is the field that needs to be initialized

    // Corrected Constructor:
    // It should take CalculatorService2 as an argument
    // And assign it to the 'calculatorService2' field
    public Calculator2(CalculatorService2 calculatorService2) { // Changed parameter type
        this.calculatorService2 = calculatorService2; // Initialize the field
    }

    public int add(int a, int b) {
        // Now 'calculatorService2' will not be null if the constructor was called correctly
        return calculatorService2.add(a, b);
    }

    public int subtract(int a, int b) {
        return calculatorService2.subtract(a, b);
    }

    public int multiply(int a, int b) {
        return calculatorService2.multiply(a, b);
    }

    public double divide(int a, int b) throws ArithmeticException {
        return calculatorService2.divide(a, b);
    }
}