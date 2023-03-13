package com.codeline.api1.First_Project.Models;


import lombok.Data;

import javax.persistence.*;





@Entity // it will say that this is a table in database
public class School extends BaseEnity{

    @Id // define the id as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // to make the primary key auto generate


    Integer id;

    @Column(name = "School_name") // change the column name
    String name;

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
}
