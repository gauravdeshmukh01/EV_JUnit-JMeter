package org.example.Entity;

import org.example.Service.CalculatorService1;

public class Calculator1 {
    CalculatorService1 service;

    public Calculator1(CalculatorService1 service) {
        this.service = service;
    }
    public void perform(int x, int y) {
        service.add(x, y);
    }
}
