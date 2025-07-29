package org.example.Entity;

import org.example.Service.CalculatorService;
import org.example.Service.CalculatorService2;

public class Calculator {

    CalculatorService service;

    public Calculator(CalculatorService service) {
        this.service = service;
    }
    public int perform(int x, int y) {
        return service.divide(x, y);
    }


}
