package com.codeline.api1.First_Project.Services;


import com.codeline.api1.First_Project.Models.Course;
import com.codeline.api1.First_Project.Repositories.CourseRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// This is where the business logic is done and everything related to the function and others and To give controller whatever it needs
public class CourseService {

    @Autowired // create one instance and can be used in the entire program
    CourseRepositories courseRepositories;


    //function that gets all the school
    public List<Course> getAllCourse() {
        return courseRepositories.getAllCourse();
    }






}
