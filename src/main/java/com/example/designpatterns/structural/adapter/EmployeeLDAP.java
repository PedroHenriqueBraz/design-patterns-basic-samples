package com.example.designpatterns.structural.adapter;

public class EmployeeLDAP {
    private String cn;

    public EmployeeLDAP(String cn) {
        this.cn = cn;
    }

    public String getCn() {
        return cn;
    }
}
