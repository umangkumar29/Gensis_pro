package com.example.employee.models;

import com.example.employee.interfaces.LeaveManagement;
import com.example.employee.interfaces.TaxDeductible;
import com.example.employee.projects.Project;

public class FullTimeEmployee extends Employee implements LeaveManagement, TaxDeductible {


    public FullTimeEmployee(String name, int age, double salary, String department, Project assigneProject) {
        super(name , age , salary , department , assigneProject);
    }

    @Override
    public double calculate() {
        return salary * 0.10;
    }

    @Override
    public void displaydetails() {
        System.out.println("Full Time Employee:-" + name + "Age:- " + age + "Salary:-" + salary + "Department:-" + department);

        if(assignedProject != null){
            System.out.println("Assigned Project:-" + assignedProject.getProjectName() + ",Team Size" + assignedProject.getProjectTeamSize());
        }
    }

    @Override
    public void requestLeave(int days, boolean isPaid) {
        if(isPaid){
            System.out.println(name + "has requested" + days + "days of paid leave");
        }else{
            System.out.println(name + "has requested" + days + "days of unpaid leave");
        }
    }
}
