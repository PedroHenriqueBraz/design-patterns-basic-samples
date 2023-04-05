package com.example.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList(){
        List<Employee> employeelist = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("123");

        EmployeeLDAP employeeLDAP = new EmployeeLDAP("34");

        employeelist.add(employeeFromDB);

        employeelist.add(new EmployeeLDAPAdapter(employeeLDAP));

        EmployeeCSV employeeCSV = new EmployeeCSV(9);

        employeelist.add(new EmployeeAdapterCSV(employeeCSV));

        return employeelist;
    }
}
