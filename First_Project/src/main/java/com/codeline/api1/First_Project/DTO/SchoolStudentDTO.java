package com.codeline.api1.First_Project.DTO;

import lombok.*;

@Setter
@Getter
@Data


public class SchoolStudentDTO {
//D T O (Data Transferred Obj)
    String stuName;
    String rollNumber;
    String name;

    public SchoolStudentDTO(String stuName, String rollNumber, String name) {
        this.stuName = stuName;
        this.rollNumber = rollNumber;
        this.name = name;
    }




}
