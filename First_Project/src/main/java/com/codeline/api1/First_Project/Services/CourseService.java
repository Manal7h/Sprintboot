package com.codeline.api1.First_Project.Services;


import com.codeline.api1.First_Project.Models.Course;
import com.codeline.api1.First_Project.Repositories.CourseRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// This is where the business logic is done and everything related to the function and others and To give controller whatever it needs
public class CourseService {

    @Autowired // create one instance and can be used in the entire program , no need to create obj
    CourseRepositories courseRepositories;


    //function that gets all the school
    public List<Course> getAllCourse() {
        return courseRepositories.getAllCourse();
    }

    public Course getCourseById(Integer id) {
        Course courses = courseRepositories.getCourseById(id); // getting the id from the user
        return courses; //creating an empty course and returning it.

    }

    public Course getCourseByName(String course_name) {
        Course course = courseRepositories.getCourseByName(course_name);
        Integer courseId = course.getId();
        course = courseRepositories.getCourseById(courseId);
        return course;

    }


}
