package com.bankSystem.com.bankSystem.codeline.Models;


import com.bankSystem.com.bankSystem.codeline.RequestObj.CreditCardRequest;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Data

@Entity // it will say : this is a table in database
public class Customer extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer id;
    String customerName;
    String customerEmail;
    Integer customerPhone;





}
