package com.bankSystem.com.bankSystem.codeline.Repositories;

import com.bankSystem.com.bankSystem.codeline.Models.Account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // to speak to the database and give data to service
// defining the course class with its primary key which is integer type // linking
public interface AccountRepositories extends JpaRepository<Account,Integer> {

    @Query("SELECT a from Account a")
        //a is alias which is static
    List<Account> getAllAccount(); // getting all the Account from the Account list


    @Query("SELECT a from Account a where a.id= :accountId")
    Account getAccountById(@Param("accountId") Integer id);


    //Account Entity: 2
    @Query(value = "Select a.balance From Account a WHERE a.id = :id")
    Double getBalanceForAccount(@Param("id") Integer id);

    //Account Entity: 3
    @Query(value = " SELECT id from Account where account_number=:accountNumber",nativeQuery = true)
    Integer getAccountByAccountNumber(@Param("accountNumber") Integer accountNumber);
}
