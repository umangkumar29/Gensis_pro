package com.example.employee.models;


import com.example.employee.interfaces.EmployeeStatus;
import com.example.employee.projects.Project;

public class ProjectIntern extends Intern implements EmployeeStatus  {

    private String employementStatus; 

    public ProjectIntern(String name, int age, double salary, String department, Project assignedProject , String employementStatus) {
        super(name, age, salary, department, assignedProject);
        this.employementStatus= employementStatus;
        
    }

    @Override
    public String checkStats() {
        return employementStatus;
    }

    @Override
    public void displaydetails(){
        super.displaydetails();
        System.out.println("Employment Status:-" + checkStats());
    }
}
