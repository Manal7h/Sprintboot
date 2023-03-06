package com.codeline.api1.First_Project.Services;

import com.codeline.api1.First_Project.Models.Course;
import com.codeline.api1.First_Project.Models.Mark;
import com.codeline.api1.First_Project.Models.School;
import com.codeline.api1.First_Project.Repositories.SchoolRepositories;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
// This is where the business logic is done and everything related to the function and others and To give controller whatever it needs
public class SchoolService {

    @Autowired // create one instance and can be used in the entire program // refreance to interface
    SchoolRepositories schoolRepositories;

    public List<School> getAllSchool() {

        return schoolRepositories.getAllSchool();
    }

    public School getSchoolById(Integer id) {
        School school = schoolRepositories.getSchoolById(id); // getting the id from the user
        return school; //creating an empty course and returning it.

    }

    public School getSchoolByName(String School_name) {
        School SchoolName = schoolRepositories.getSchoolByName(School_name);
        return SchoolName;
    }


    public void setCreateDateByUserInput(String stringData,Integer id) throws ParseException{


        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date javaDate = formatter.parse(stringData);
        School school = schoolRepositories.getSchoolById(id);
        school.setCreatedDate(javaDate);
        schoolRepositories.save(school);
    }

    public List<School> getAllActiveSchool(){
        return  schoolRepositories.getAllActiveSchool();
    }

    public List<School> getAllUnActiveSchool(){
        return  schoolRepositories.getAllUnActiveSchool();
    }

    public List<School> getSchoolLatestRow(){
        return  schoolRepositories.getSchoolLatestRow();
    }

    public List<School> getSchoolLatestUpdated(){
        return  schoolRepositories.getSchoolLatestUpdated();
    }

    public void deleteById(Integer id){
        School school=schoolRepositories.getSchoolById(id);
        school.setActive(Boolean.FALSE);
        schoolRepositories.save(school);
    }



}
