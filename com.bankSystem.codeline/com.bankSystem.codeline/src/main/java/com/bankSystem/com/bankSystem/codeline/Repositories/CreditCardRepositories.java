package com.bankSystem.com.bankSystem.codeline.Repositories;

import com.bankSystem.com.bankSystem.codeline.Models.Account;
import com.bankSystem.com.bankSystem.codeline.Models.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // to speak to the database and give data to service
// defining the course class with its primary key which is integer type // linking
public interface CreditCardRepositories extends JpaRepository<CreditCard,Integer> {


    @Query("SELECT c from CreditCard c")
        //a is alias which is static
    List<CreditCard> getAllCreditCard(); // getting all the Account from the Account list
}

