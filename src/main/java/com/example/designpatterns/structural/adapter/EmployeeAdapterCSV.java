package com.example.designpatterns.structural.adapter;

public class EmployeeAdapterCSV implements Employee{
    private EmployeeCSV employeeCSV;

    public EmployeeAdapterCSV(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    @Override
    public String getId() {
        return employeeCSV.getId() + "";
    }
}
