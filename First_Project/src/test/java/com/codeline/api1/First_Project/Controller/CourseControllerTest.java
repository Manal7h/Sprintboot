package com.codeline.api1.First_Project.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseControllerTest {
@Autowired
CourseController courseController;

//    @Test
//    void getAllCourse() {
//        String allCourse = courseController.getAllCourse(1)
//        assertNotNull(allCourse);
//    }

    @Test
    void getCourseById() {
    String courseId = courseController.getCourseById(1).getName();
    assertEquals("Java" , courseId);
    }

    @Test
    void getCourseByName() {
        String courseName = courseController.getCourseByName("Java").getName();
        assertNotNull(courseName);
    }
}