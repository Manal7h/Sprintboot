package com.codeline.api1.First_Project.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data

public class CourseMarkDTO {

    String name;
    Integer obtainMark;
    String grade;

    public CourseMarkDTO(String name, Integer obtainMark, String grade) {
        this.name = name;
        this.obtainMark = obtainMark;
        this.grade = grade;
    }
}
