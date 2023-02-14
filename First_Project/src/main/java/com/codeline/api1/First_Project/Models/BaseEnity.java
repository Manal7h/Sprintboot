package com.codeline.api1.First_Project.Models;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.MappedSuperclass;
import javax.xml.crypto.Data;
import java.util.Date;

@MappedSuperclass
public class BaseEnity {

    @CreatedDate
    Date createdDate;

    @UpdateTimestamp
    Date updatedDate;
    Boolean isActive;
}
