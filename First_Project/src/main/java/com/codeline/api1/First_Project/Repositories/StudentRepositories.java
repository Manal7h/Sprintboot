package com.codeline.api1.First_Project.Repositories;


import com.codeline.api1.First_Project.Models.Course;
import com.codeline.api1.First_Project.Models.School;
import com.codeline.api1.First_Project.Models.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // to speak to the database and give data to service
// defining the course class with its primary key which is integer type // linking
public interface StudentRepositories extends CrudRepository<Student,Integer> {

    @Query("SELECT t from Student t")
        //t is alias which is static
    List<Student> getAllStudent(); // getting all the course from the course list

    @Query("SELECT t from Student t where t.id= :studentId")
    Student getStudentById(@Param("studentId") Integer id);

    @Query("SELECT t from from Course t where o.name= :Student_name")
    Student getStudentByName(@Param("Student_name") String Student_name);

    @Query(value = "SELECT DISTINCT schoolId FROM Student", nativeQuery = true)
    List<Integer> getDistinctSchoolIdsFromStudent();


    //get School By Number Of Student
    @Query(value = "SELECT COUNT(id) From Student where schoolId = ?1", nativeQuery = true)
    Integer getCountOfStudentsBySchoolId(Integer schoolId);
}

