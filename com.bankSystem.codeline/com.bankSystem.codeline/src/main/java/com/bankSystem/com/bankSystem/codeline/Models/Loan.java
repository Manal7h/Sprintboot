package com.bankSystem.com.bankSystem.codeline.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Getter
@Setter
@Data

@Entity
public class Loan extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer id;
    Double amount;
    Double insertRate;



    @OneToOne  // one lone to one customer
    @JoinColumn(name = "customer_id" , referencedColumnName = "id") //defining the foreign key
    Customer customer;


}
