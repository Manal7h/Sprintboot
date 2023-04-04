package com.codeline.api1.First_Project.Models;


import lombok.Data;

import javax.persistence.*;


@Entity // it will say that this is a table in database
public class Student extends BaseEnity{

    @Id // define the id as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // to make the primary key auto generate
    Integer id;

    @Column(name = "Student_name") // change the column name
    String stuName;

    String rollNumber;

    @ManyToOne // many student to one school
    @JoinColumn(name = "school_id" , referencedColumnName = "id") //defining the foreign key
    School school;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
