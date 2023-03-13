package com.codeline.api1.First_Project.Controller;


import com.codeline.api1.First_Project.Models.Mark;
import com.codeline.api1.First_Project.Models.School;
import com.codeline.api1.First_Project.Request.SchoolRequestForCreateDateUpdate;
import com.codeline.api1.First_Project.Services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping(value = "school")
public class SchoolController {

    @Autowired
    SchoolService schoolService; //NOT NULL
    //=new SchoolService();

    @RequestMapping(value = "/getAll" , method = RequestMethod.GET) // start the connection between java and web request onto specific handeler class/method
    public List<School> getAllSchool() {
        List<School> school = schoolService.getAllSchool();
        return school;
    }

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public School getSchoolById(@RequestParam Integer schoolId) {
        School school = schoolService.getSchoolById(schoolId);
        return school;
    }


    @RequestMapping(value =  "/getAllActiveSchool")
    public  List<School> getAllActiveSchool() {
    List<School> activeSchoolList = schoolService.getAllActiveSchool();
    return activeSchoolList;
}

    @RequestMapping(value =  "/getAllActiveSchool")
    public  List<School> getAllUnActiveSchool() {
        List<School> unActiveSchoolList = schoolService.getAllUnActiveSchool();
        return unActiveSchoolList;
    }



    @RequestMapping(value = "updateCreateDateByUserInput", method = RequestMethod.POST)
    public void setCreateDateByUserInput(@RequestParam SchoolRequestForCreateDateUpdate data) throws ParseException{
        schoolService.setCreateDateByUserInput(data.getDate(),data.getId());
    }


    @RequestMapping(value = "/getSchoolByName" , method = RequestMethod.POST)
    public School getSchoolByName(@RequestParam String School_name){
        School schoolName = schoolService.getSchoolByName(School_name);
        return schoolName;

    }

    @RequestMapping(value =  "/getSchoolLatestRow")
    public  List<School> getSchoolLatestRow() {
        List<School> schoolLatestRow = schoolService.getSchoolLatestRow();
        return schoolLatestRow;
    }

    @RequestMapping(value =  "/getSchoolLatestUpdated")
    public  List<School> getSchoolLatestUpdated() {
        List<School> SchoolLatestUpdated = schoolService.getSchoolLatestUpdated();
        return SchoolLatestUpdated;
    }

    @RequestMapping(value = "/deleteById")
    public void deleteById(Integer id){
        schoolService.deleteById(id);
    }



    // Function that school by the User input for the Number of students (getSchoolByNumberOfStudents)
    @RequestMapping(value = "/getSchoolByNumberOfStudent", method = RequestMethod.POST)
    public School getSchoolByNumberOfStudent(@RequestParam Integer numberOfStudent) {
        return (School) schoolService.getSchoolByNumberOfStudent(numberOfStudent);

    }




}
