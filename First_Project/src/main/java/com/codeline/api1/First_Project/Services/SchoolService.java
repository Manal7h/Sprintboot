package com.codeline.api1.First_Project.Services;

import com.codeline.api1.First_Project.Models.Course;
import com.codeline.api1.First_Project.Models.Mark;
import com.codeline.api1.First_Project.Models.School;
import com.codeline.api1.First_Project.Repositories.SchoolRepositories;
import com.codeline.api1.First_Project.Repositories.StudentRepositories;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service //All Function are witten here , give controller these Function
// This is where the business logic is done and everything related to the function and others and To give controller whatever it needs



public class SchoolService {

    @Autowired // create one instance and can be used in the entire program
    SchoolRepositories schoolRepositories;
    StudentRepositories studentRepositories;

    //get All School
    public List<School> getAllSchool() {
        return schoolRepositories.getAllSchool(); //@Query("SELECT s from School s") //List<School> getAllSchool();
    }


    //get School By Id
    public School getSchoolById(Integer id) {
        School school = schoolRepositories.getSchoolById(id); // getting the id from the user
        return school; //creating an empty course and returning it.

        //    @Query("SELECT s from School s where s.id= :schoolId")
        //    School getSchoolById(@Param("schoolId") Integer id);
    }


    //get School By Name
    public School getSchoolByName(String School_name) {
        School SchoolName = schoolRepositories.getSchoolByName(School_name);
        return SchoolName;

        //    @Query("SELECT s from School s where s.name= :SchoolName")
        //    School getSchoolByName(@Param("SchoolName")String School_name);
    }


    public void setCreateDateByUserInput(String stringData, Integer id) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date javaDate = formatter.parse(stringData);
        School school = schoolRepositories.getSchoolById(id);
        school.setCreatedDate(javaDate);
        schoolRepositories.save(school);
    }


    public List<School> getAllActiveSchool() {
        return schoolRepositories.getAllActiveSchool();

//            @Query(value = "SELECT s from School s where s.isActive= :true")
//            List<School> getAllActiveSchool();
    }


    public List<School> getAllUnActiveSchool() {
        return schoolRepositories.getAllUnActiveSchool();
    }


    public List<School> getSchoolLatestRow() {
        return schoolRepositories.getSchoolLatestRow();

//            @Query(value = "SELECT s from School s where s.id= (SELECT MAX(s.id) FROM School s)")
//            List<School> getSchoolLatestRow();
    }


    public List<School> getSchoolLatestUpdated() {
        return schoolRepositories.getSchoolLatestUpdated();
    }


    public void deleteById(Integer id) {
        School school = schoolRepositories.getSchoolById(id);
        school.setActive(Boolean.FALSE);
        schoolRepositories.save(school);
    }

    //get School By Number Of Student
    public List<School> getSchoolByNumberOfStudent(Integer numberOfStudent) {
        List<Integer> typesOfSchoolIdsInStudent = studentRepositories.getDistinctSchoolIdsFromStudent();
        //{1,2 }
        Integer schoolIdThatUserWants = 0;

        for (Integer idOfSchool : typesOfSchoolIdsInStudent) {
            Integer count = studentRepositories.getCountOfStudentsBySchoolId(idOfSchool);

            if (numberOfStudent == count) {
                schoolIdThatUserWants = idOfSchool;
                break;
            }
        }

        School schoolThatUserWasLookingFor = schoolRepositories.getSchoolById(schoolIdThatUserWants);
        return (List<School>) schoolThatUserWasLookingFor;

//        List<Integer> schoolIdsThatUserWants = new ArrayList<>();
//
//        for (Integer idOfSchool : typesOfSchoolIdsInStudent) {
//            Integer count = studentRepositories.getCountOfStudentsBySchoolId(idOfSchool);
//            if (numberOfStudent == count) {
//                schoolIdsThatUserWants.add(idOfSchool);
//            }
//        }
//
//        List<School> schoolThatUserWasLookingFor = schoolRepositories.findAllById(schoolIdsThatUserWants);
//        return schoolThatUserWasLookingFor;

    }
}


