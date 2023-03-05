package com.codeline.api1.First_Project.Services;


import com.codeline.api1.First_Project.Models.Course;
import com.codeline.api1.First_Project.Models.School;
import com.codeline.api1.First_Project.Models.Student;
import com.codeline.api1.First_Project.Repositories.StudentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// This is where the business logic is done and everything related to the function and others and To give controller whatever it needs
public class StudentService {

    @Autowired
     // create one instance and can be used in the entire program
    StudentRepositories studentRepositories;

    public List<Student> getAllStudent() {
        return studentRepositories.getAllStudent();
    }

    public Student getStudentById(Integer id) {
        Student student = studentRepositories.getStudentById(id); // getting the id from the user
        return student; //creating an empty course and returning it.

    }

    public Student getStudentByName(String Student_name) {
        Student student = studentRepositories.getStudentByName(Student_name);
        Integer studentId = student.getId();
        student = studentRepositories.getStudentById(studentId);
        return student;

    }
}
