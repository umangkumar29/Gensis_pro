package com.example.employee.models;

import com.example.employee.projects.Project;

public class SubContractedemployee extends Employee{

    public SubContractedemployee(String name, int age, double salary, String department, Project assignedProject) {
        super(name, age, salary, department, assignedProject);
    }

    @Override
    public void displaydetails() {
        System.out.println("Sub Contracted Employee:-" + name + " ,Age:- " + age + " ,Salary:-" + salary + " ,Department:-" + department);

        if(assignedProject != null){
            System.out.println(" Assigned Project:-" + assignedProject.getProjectName() + " ,Team Size" + assignedProject.getProjectTeamSize());
        }
    }
    
}
