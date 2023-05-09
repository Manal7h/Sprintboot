package com.bankSystem.com.bankSystem.codeline.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;

import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Data

@Entity

public class Transaction extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer id;
    Double amount;
    Date transactionDate;



//    @ManyToOne  // many transaction to one creditCard
//    @JoinColumn(name = "creditCard_id" , referencedColumnName = "id") //defining the foreign key
//    CreditCard creditCard;

    @ManyToOne  // many transaction to one account
    @JoinColumn(name = "account_id" , referencedColumnName = "id") //defining the foreign key
    Account account;
}
