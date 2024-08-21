package com.example.employee.models;

import com.example.employee.projects.Project;

abstract class Employee {
    protected String name;
    protected int age;
    protected double salary;
    protected String department;
    protected Project assignedProject;

    public Employee(String name, int age, double salary, String department, Project assignedProject) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.assignedProject = assignedProject;
    }

    public abstract void displaydetails();
}