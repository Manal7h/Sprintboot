package com.codeline.api1.First_Project.Repositories;


import com.codeline.api1.First_Project.Models.Course;
import com.codeline.api1.First_Project.Models.Mark;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // to speak to the database and give data to service
// defining the course class with its primary key which is integer type // linking
public interface MarkRepositories extends CrudRepository<Mark,Integer> {

    @Query("SELECT k from Mark k")
        //K is alias which is static
    List<Mark> getAllMark(); // getting all the course from the course list

    @Query("SELECT K from Mark K where K.id= :marksId")
    Mark getMarksById(@Param("marksId") Integer id);

    @Query(value = "SELECT sum(k.obtainMark) From Mark k where k.course.student.id = :studentId")
    Integer sumOfStudentMarksByStudentId(@Param("studentId") Integer studentId);


}
