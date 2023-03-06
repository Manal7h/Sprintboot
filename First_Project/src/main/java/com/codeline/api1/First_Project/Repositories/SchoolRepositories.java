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

    @Query("SELECT s from School s")
        //s is alias which is static
    List<School> getAllSchool(); // getting all the course from the course list

    @Query("SELECT s from School s where s.id= :schoolId")
    School getSchoolById(@Param("schoolId") Integer id);

    @Query("SELECT s from School s where s.name= :SchoolName")
    School getSchoolByName(@Param("SchoolName")String School_name);

    @Query(value = "SELECT s from School s where s.isActive= :true")
    List<School> getAllActiveSchool();

    @Query(value = "SELECT s from School s where s.isActive= :false")
    List<School> getAllUnActiveSchool();

    @Query(value = "SELECT s from School s where s.id= (SELECT MAX(s.id) FROM School s)")
    List<School> getSchoolLatestRow();

    @Query(value = "SELECT s from School s where s.updatedDate= (SELECT MAX(s.updatedDate) FROM School s)")
    List<School> getSchoolLatestUpdated();
}
