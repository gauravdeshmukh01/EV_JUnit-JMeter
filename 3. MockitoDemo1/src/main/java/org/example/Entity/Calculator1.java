package org.example.Entity;

import org.example.Service.CalculatorService1;

public class Calculator1 {
    CalculatorService1 service;

    public Calculator1(CalculatorService1 service) {
        this.service = service;
    }
    public int perform(int x, int y) {
      return   service.add(x, y);
    }
}
