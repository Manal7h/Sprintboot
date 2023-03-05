package com.codeline.api1.First_Project.Services;

import com.codeline.api1.First_Project.Models.Course;
import com.codeline.api1.First_Project.Models.Mark;
import com.codeline.api1.First_Project.Repositories.MarkRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// This is where the business logic is done and everything related to the function and others and To give controller whatever it needs
public class MarkService {

    @Autowired // create one instance and can be used in the entire program
    MarkRepositories markRepositories;

    public List<Mark> getAllMark() {
        return markRepositories.getAllMark();
    }


    public Mark getMarksById(Integer id) {
        Mark marks = markRepositories.getMarksById(id); // getting the id from the user
        return marks; //creating an empty course and returning it.

    }


}