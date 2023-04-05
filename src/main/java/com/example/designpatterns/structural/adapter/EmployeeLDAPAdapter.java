package com.example.designpatterns.structural.adapter;

public class EmployeeLDAPAdapter implements Employee {
    private EmployeeLDAP instance;

    public EmployeeLDAPAdapter(EmployeeLDAP instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return this.instance.getCn();
    }
}
