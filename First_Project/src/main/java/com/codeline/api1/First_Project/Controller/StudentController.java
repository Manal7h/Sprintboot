package com.codeline.api1.First_Project.Controller;

import com.codeline.api1.First_Project.Models.Course;
import com.codeline.api1.First_Project.Models.School;
import com.codeline.api1.First_Project.Models.Student;
import com.codeline.api1.First_Project.Services.ReportService;
import com.codeline.api1.First_Project.Services.StudentService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping(value = "student")
public class StudentController {


    @Autowired // create one instance and can be used in the entire program
    StudentService studentService;

    @Autowired
    ReportService reportService;

    @RequestMapping(value = "/getAll" , method = RequestMethod.GET) // start the connection between java and web request onto specific handeler class/method
    public List<Student> getAllStudent() {
        List<Student> student = studentService.getAllStudent();
        return student;
    }

    @RequestMapping(value = "/getById", method = RequestMethod.GET)
    public Student getStudentById(@RequestParam Integer studentId) {
        Student student = studentService.getStudentById(studentId);
        return student;
    }

    @RequestMapping(value = "/getStudentByName" , method = RequestMethod.POST)
    public Student getStudentByName(@RequestParam String Student_name){
        Student student = studentService.getStudentByName(Student_name);
        return student;

    }


@RequestMapping(value = "report")
    public  String generateStudentReport()throws FileNotFoundException, JRException {
        return reportService.generateStudentReport();
    }


}
//localhost:8080/student/getById?studentId=1