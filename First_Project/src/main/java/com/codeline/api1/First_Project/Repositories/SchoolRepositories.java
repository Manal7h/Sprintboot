package com.codeline.api1.First_Project.Repositories;


import com.codeline.api1.First_Project.Models.Course;
import com.codeline.api1.First_Project.Models.Mark;
import com.codeline.api1.First_Project.Models.School;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

    @Repository // to speak to the database and give data to service

    // defining the course class with its primary key which is integer type // linking
    public interface SchoolRepositories extends CrudRepository<School,Integer> {


    //get All School
    @Query("SELECT s from School s") //s is alias which is static
    List<School> getAllSchool(); // getting all the school from the school list


    //get School By Id
    @Query("SELECT s from School s where s.id= :schoolId")
    School getSchoolById(@Param("schoolId") Integer id); //Integer id in class School in Models



    //get School By Name
    @Query("SELECT s from School s where s.name= :SchoolName")
    School getSchoolByName(@Param("SchoolName")String School_name); //String School_name in class School in Models

    //get All Active School
    @Query(value = "SELECT s from School s where s.isActive= :true")
    List<School> getAllActiveSchool();


    //get All Un Active School
    @Query(value = "SELECT s from School s where s.isActive= :false")
    List<School> getAllUnActiveSchool();


    //get School Latest Row
    @Query(value = "SELECT s from School s where s.id= (SELECT MAX(s.id) FROM School s)")
    List<School> getSchoolLatestRow();




    @Query(value = "SELECT s from School s where s.updatedDate= (SELECT MAX(s.updatedDate) FROM School s)")
    List<School> getSchoolLatestUpdated();



        @Query(value = "SELECT DISTINCT school_id FROM student", nativeQuery = true)
        List<Integer> getDistinctSchoolIdsFromStudent();

        //get School By Number Of Student
        @Query(value = "SELECT COUNT(id) From student where schoolId = ?1", nativeQuery = true)
        Integer getCountOfStudentsBySchoolId(Integer schoolId);
}
