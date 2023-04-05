package com.example.designpatterns.structural.adapter;

public class EmployeeDB implements Employee {
    private String id;

    public EmployeeDB(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
