package com.infosys.model;

public class Employee {
    private int id;
    private String name;
    private double monthlySalary;

    public Employee() {}

    public Employee(int id, String name, double monthlySalary) {
        this.id = id;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getMonthlySalary() { return monthlySalary; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setMonthlySalary(double monthlySalary) { this.monthlySalary = monthlySalary; }
}