package com.codeline.api1.First_Project.DTO;

import lombok.*;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentSchoolDTO {



    String stuName;
    String name;

    public StudentSchoolDTO(String stuName, String name) {
        this.stuName = stuName;
        this.name = name;
    }
}
