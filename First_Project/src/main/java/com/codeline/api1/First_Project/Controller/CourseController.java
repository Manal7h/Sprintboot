package com.codeline.api1.First_Project.Controller;

import com.codeline.api1.First_Project.Models.Course;
import com.codeline.api1.First_Project.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "course")


public class CourseController {

    @Autowired // create one instance and can be used in the entire program
    CourseService courseService ;

    @RequestMapping(value = "course/getAll" , method = RequestMethod.GET) // start the connection between java and web request onto specific handeler class/method
    public List<Course> getAllCourse() {
        List<Course> courses = courseService.getAllCourse();
        // Course courses = new Course(); // creating an empty school
        ////courseService.getCourseById(courseId);
        return courses;

    }

    @RequestMapping(value = "course/getById", method = RequestMethod.GET)
    public Course getCourseById(@RequestParam Integer courseId) {
        Course courses = courseService.getCourseById(courseId);
        return courses;
    }
}
