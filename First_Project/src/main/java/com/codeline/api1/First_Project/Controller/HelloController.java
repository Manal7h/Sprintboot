package com.codeline.api1.First_Project.Controller;


import com.codeline.api1.First_Project.Models.Course;
import com.codeline.api1.First_Project.Models.Mark;
import com.codeline.api1.First_Project.Models.School;
import com.codeline.api1.First_Project.Models.Student;
import com.codeline.api1.First_Project.Repositories.CourseRepositories;
import com.codeline.api1.First_Project.Repositories.MarkRepositories;
import com.codeline.api1.First_Project.Repositories.SchoolRepositories;
import com.codeline.api1.First_Project.Repositories.StudentRepositories;
import com.codeline.api1.First_Project.Services.CourseService;
import com.codeline.api1.First_Project.Services.MarkService;
import com.codeline.api1.First_Project.Services.SchoolService;
import com.codeline.api1.First_Project.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // controller speaking to the outside world (create api, connect java to the web service)
public class HelloController {

    // to link the service classes with the main controller class
    @Autowired // create one instance and can be used in the entire program
    CourseService courseService ;

    @Autowired // create one instance and can be used in the entire program
    MarkService markService;

    @Autowired // create one instance and can be used in the entire program
    SchoolService schoolService;

    @Autowired // create one instance and can be used in the entire program
    StudentService studentService;

    @RequestMapping(value = "course/getAll" , method = RequestMethod.GET) // start the connection between java and web request onto specific handeler class/method
    public List<Course> getAllCourse() {
        List<Course> courses = courseService.getAllCourse();
        // Course courses = new Course(); // creating an empty school
        ////courseService.getCourseById(courseId);
        return courses;

    }

    @RequestMapping(value = "mark/getAll" , method = RequestMethod.GET) // start the connection between java and web request onto specific handeler class/method
    public List<Mark> getAllMark() {
        List<Mark> marks = markService.getAllMark();
        return marks;

    }

    @RequestMapping(value = "school/getAll" , method = RequestMethod.GET) // start the connection between java and web request onto specific handeler class/method
    public List<School> getAllSchool() {
        List<School> school = schoolService.getAllSchool();
        return school;
    }

    @RequestMapping(value = "student/getAll" , method = RequestMethod.GET) // start the connection between java and web request onto specific handeler class/method
    public List<Student> getAllStudent() {
        List<Student> student = studentService.getAllStudent();
        return student;
    }


}
