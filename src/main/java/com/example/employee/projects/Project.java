package com.example.employee.projects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Project {
    private String ProjectName;
    private int ProjectTeamSize;
    
    public Project(String ProjectName , int ProjectTeamSize ){
        this.ProjectName = ProjectName;
        this.ProjectTeamSize = ProjectTeamSize;
    }
}
