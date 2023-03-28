package com.codeline.api1.First_Project.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MarkControllerTest {
@Autowired
MarkController markController;

    @Test
    void getAllMark() {
    }

    @Test
    void getMarkById() {
        String markId = markController.getMarkById(1).getGrade();
        assertEquals(null , markId);
    }

    @Test
    void getMarkById1() {
        String markId = markController.getMarkById(1).getGrade();
        assertNull(markId);
    }
}