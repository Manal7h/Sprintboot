package com.codeline.api1.First_Project.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data

public class SchoolStudentDTO {

    String stuName;
    String rollNumber;
    String name;

    public SchoolStudentDTO(String stuName, String rollNumber, String name) {
        this.stuName = stuName;
        this.rollNumber = rollNumber;
        this.name = name;
    }




}
