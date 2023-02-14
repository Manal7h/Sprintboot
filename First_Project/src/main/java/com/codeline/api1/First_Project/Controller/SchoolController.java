package com.codeline.api1.First_Project.Controller;


import com.codeline.api1.First_Project.Models.School;
import com.codeline.api1.First_Project.Services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "school")
public class SchoolController {

    @Autowired
    SchoolService schoolService; //NOT NULL
    //=new SchoolService();

    @RequestMapping(value = "school/getAll" , method = RequestMethod.GET) // start the connection between java and web request onto specific handeler class/method
    public List<School> getAllSchool() {
        List<School> school = schoolService.getAllSchool();
        return school;
    }


}
