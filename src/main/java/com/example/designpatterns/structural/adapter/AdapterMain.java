package com.example.designpatterns.structural.adapter;

public class AdapterMain {
    public static void main(String args[]){
        EmployeeClient client = new EmployeeClient();

        var employees = client.getEmployeeList();

        employees.forEach(e -> System.out.println(e.getId()));
    }
}
