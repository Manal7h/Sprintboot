package com.codeline.api1.First_Project.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SchoolControllerTest {
    @Autowired
    SchoolController schoolController;

    @Test
    void getAllSchool() {
    }

    @Test
    void getSchoolById() {
        String schoolId = schoolController.getSchoolById(1).getName();
        assertEquals("Oman" , schoolId);
    }

    @Test
    void getAllActiveSchool() {
    }

    @Test
    void getAllUnActiveSchool() {
    }

    @Test
    void setCreateDateByUserInput() {
    }

    @Test
    void getSchoolByName() {
    }

    @Test
    void getSchoolLatestRow() {
    }

    @Test
    void getSchoolLatestUpdated() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void getSchoolByNumberOfStudent() {
    }
}