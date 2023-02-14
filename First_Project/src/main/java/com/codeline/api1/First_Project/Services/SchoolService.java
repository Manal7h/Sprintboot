package com.codeline.api1.First_Project.Services;

import com.codeline.api1.First_Project.Models.Course;
import com.codeline.api1.First_Project.Models.Mark;
import com.codeline.api1.First_Project.Models.School;
import com.codeline.api1.First_Project.Repositories.SchoolRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// This is where the business logic is done and everything related to the function and others and To give controller whatever it needs
public class SchoolService {

    @Autowired // create one instance and can be used in the entire program
    SchoolRepositories schoolRepositories;

    public List<School> getAllSchool() {

        return schoolRepositories.getAllSchool();
    }

    public School getSchoolById(Integer id) {
        School school = schoolRepositories.getSchoolById(id); // getting the id from the user
        return school; //creating an empty course and returning it.

    }
}
