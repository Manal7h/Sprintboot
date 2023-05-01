package com.codeline.api1.First_Project.DTO;

import lombok.*;

@Getter
@Setter
@Data



public class TopPreformingStudentsDTO {

    String studName;
    String schoolName;

    public TopPreformingStudentsDTO(String studName, String schoolName) {
        this.studName = studName;
        this.schoolName = schoolName;
    }
}
