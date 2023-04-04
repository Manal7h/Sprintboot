package com.codeline.api1.First_Project.Services;

import com.codeline.api1.First_Project.DTO.SchoolStudentDTO;
import com.codeline.api1.First_Project.Models.School;
import com.codeline.api1.First_Project.Models.Student;
import com.codeline.api1.First_Project.Repositories.SchoolRepositories;
import com.codeline.api1.First_Project.Repositories.StudentRepositories;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {
    @Autowired
    private SchoolRepositories schoolRepository;
    @Autowired
    StudentRepositories studentRepositories;



    public static final String pathToReports = "C:\\Users\\user018\\Downloads\\reports";

    public String generateReport()throws FileNotFoundException, JRException {
        List<School> schoolList = schoolRepository.getAllSchool();


        File file = ResourceUtils.getFile("classpath:School_Report.jrxml"); //classpath get the report
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath()); //File tell JR to compileReport
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(schoolList);
        Map<String, Object> paramters = new HashMap<>();
        paramters.put("CreatedBy", "Manal");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,paramters , dataSource); //print, format
        JasperExportManager.exportReportToPdfFile(jasperPrint,pathToReports+"\\schools.pdf");
        return "Report generated : " + pathToReports+"\\schools.pdf";
    }


    public String generateStudentReport()throws FileNotFoundException, JRException {
        List<Student> studentList = studentRepositories.getAllStudent();
        List<SchoolStudentDTO> schoolStudentDTOS = new ArrayList<>();
        for (Student student: studentList) {

            String name = student.getSchool().getName();
            String rollNamber = student.getRollNumber();
            String stuName = student.getName();


            SchoolStudentDTO schoolStudentDTO = new SchoolStudentDTO (name , rollNamber , stuName);//saving
            schoolStudentDTOS.add(schoolStudentDTO);

        }


        File file = ResourceUtils.getFile("classpath:Student_Report.jrxml"); //classpath get the report
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath()); //File tell JR to compileReport
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(schoolStudentDTOS);
        Map<String, Object> paramters = new HashMap<>();
        paramters.put("CreatedBy", "Manal");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,paramters , dataSource); //print, format
        JasperExportManager.exportReportToPdfFile(jasperPrint,pathToReports+"\\student.pdf");
        return "Report generated : " + pathToReports+"\\student.pdf";
    }
}
