package com.bankSystem.com.bankSystem.codeline.Repositories;


import com.bankSystem.com.bankSystem.codeline.Models.Loan;
import com.bankSystem.com.bankSystem.codeline.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // to speak to the database and give data to service
// defining the course class with its primary key which is integer type // linking
public interface TransactionRepositories extends JpaRepository<Transaction,Integer>  {

    @Query("SELECT t from Transaction t")
    List<Transaction> getAllTransaction();

    @Query("SELECT a from Transaction a where a.id= :transactionId")
    Transaction getTransactionById(@Param("transactionId") Integer id);
}
