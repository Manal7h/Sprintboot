package com.codeline.api1.First_Project.Repositories;

import com.codeline.api1.First_Project.Models.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // to speak to the database and give data to service
// defining the course class with its primary key which is integer type // linking //genaral
public interface CourseRepositories extends CrudRepository<Course,Integer> {

    @Query("SELECT m from Course m")
    //m is alias which is static
    List<Course> getAllCourse(); // getting all the course from the course list

    @Query("SELECT m from Course m where m.id= :courseId")
    Course getCourseById(@Param("courseId") Integer id);

//    @Query("SELECT o from from Course o where o.name =:course_name")
//    Course getCourseByName(@Param("course_name") String course_name); //mapping the query and returning the Course
}


