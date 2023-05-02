package com.codeline.api1.First_Project.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class OverallPerformanceOfEachStudent {

    Integer studentId;
    String studentRollNumber;
    String studentName;
    Integer averageMark;

    public OverallPerformanceOfEachStudent(Integer studentId, String studentRollNumber, String studentName, Integer averageMark) {
        this.studentId = studentId;
        this.studentRollNumber = studentRollNumber;
        this.studentName = studentName;
        this.averageMark = averageMark;
    }
}
