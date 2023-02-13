package com.codeline.api1.First_Project.Models;

import javax.persistence.*;

@Entity // it will say that this is a table in database
public class Mark {


    @Id // define the id as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // to make the primary key auto generate
    Integer id;
    Integer obtainMark;
    String grade;



    @ManyToOne // many mark to one course
    @JoinColumn(name = "course_id" , referencedColumnName = "id") //defining the foreign key
    Course course;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getObtainMark() {
        return obtainMark;
    }

    public void setObtainMark(Integer obtainMark) {
        this.obtainMark = obtainMark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
