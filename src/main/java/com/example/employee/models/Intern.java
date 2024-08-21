package com.example.employee.models;

import com.example.employee.interfaces.LeaveManagement;
import com.example.employee.interfaces.TaxDeductible;
import com.example.employee.projects.Project;

public class Intern extends Employee implements LeaveManagement , TaxDeductible{

    public Intern(String name, int age, double salary, String department, Project assignedProject) {
        super(name, age, salary, department, assignedProject);
    }

    @Override
    public double calculate() {
        return salary * 0.05;
    }

    @Override
    public void requestLeave(int days, boolean isPaid) {
        System.out.println(name + " has requested " + days + " days of unpaid leave");
    }

    @Override
    public void displaydetails() {
        System.out.println("Intern :-" + name + " ,Age:- " + age + " ,Stipend:-" + salary + " ,Department:-" + department);

        if(assignedProject != null){
            System.out.println("Assigned Project:-" + assignedProject.getProjectName() + " ,Team Size:-" + assignedProject.getProjectTeamSize());
        }
    }

    
}
