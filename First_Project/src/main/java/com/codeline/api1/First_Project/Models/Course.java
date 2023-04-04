package com.codeline.api1.First_Project.Models;


import lombok.Data;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;


@Entity // it will say : this is a table in database
public class Course extends BaseEnity{


    @Id // define the id as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // to make the primary key auto generate
    Integer id;


    @Column(name = "course_name") // change the column name
    String name;

    @ManyToOne // many course to one student
    @JoinColumn(name = "student_id", referencedColumnName = "id") //defining the foreign key
    Student student;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
