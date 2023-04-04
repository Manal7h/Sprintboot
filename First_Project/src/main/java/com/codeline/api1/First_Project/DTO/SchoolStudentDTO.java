package com.codeline.api1.First_Project.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data

public class SchoolStudentDTO {

    String name;
    String rollNumber;
    String stuName;

    public SchoolStudentDTO(String name, String rollNumber, String stuName) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.stuName = stuName;
    }
}
