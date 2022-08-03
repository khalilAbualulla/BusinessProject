package dev.Expenses.entites;

import dev.employee.entites.employee;

public class expensies {

    enum expencsesType {
        Pending,
        prove,
        dienied
    }

    private int employeeID;
    private String description;
    private String type;

    public expensies(int employeeID,String description, String type) {
        this.description = description;
        this.employeeID=employeeID;
        this.type = String.valueOf(expencsesType.Pending);
    }



}
