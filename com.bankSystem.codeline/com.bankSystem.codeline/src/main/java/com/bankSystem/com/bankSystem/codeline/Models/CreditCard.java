package com.bankSystem.com.bankSystem.codeline.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Getter
@Setter
@Data

@Entity // it will say : this is a table in database
public class CreditCard extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer id;
    Integer cardNumber;
    Double creditLimit;

    @OneToOne // one customer to one creditCard
    @JoinColumn(name = "customer_id" , referencedColumnName = "id") //defining the foreign key
    Customer customer;



}
