package com.example.employee;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.employee.models.FullTimeEmployee;
import com.example.employee.models.ProjectIntern;
import com.example.employee.models.SubContractedemployee;
import com.example.employee.models.SummerIntern;
import com.example.employee.projects.Project;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		// SpringApplication.run(EmployeeApplication.class, args);

		Project project1 = new Project("WEB Application", 6);

		Project project2 = new Project("Open CV", 6);

		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Umang", 21, 50000, "CS", project1);

		SummerIntern summerIntern = new SummerIntern("RObin", 22, 20000, "HR", project2);

		ProjectIntern projectIntern = new ProjectIntern("AYush" , 24 , 15000.0 , "Finance"  , project1, "IN_PROGRESS");

		SubContractedemployee subContractedemployee = new SubContractedemployee("Ayush Gupta", 25, 20000, "MArketing", project2);


	
		System.out.println("-------------------------------");
		fullTimeEmployee.displaydetails();
		System.out.println("-------------------------------");
		summerIntern.displaydetails();
		System.out.println("-------------------------------");
		subContractedemployee.displaydetails();
		System.out.println("-------------------------------");
		projectIntern.displaydetails();
		System.out.println("-------------------------------");
		projectIntern.requestLeave(4, false);
		System.out.println("-------------------------------");
		System.out.println("Checking TDS on Stipend" + projectIntern.calculate());
		System.out.println("-------------------------------");
	}

}
