package com.bankSystem.com.bankSystem.codeline.Repositories;



import com.bankSystem.com.bankSystem.codeline.Models.Customer;
import com.bankSystem.com.bankSystem.codeline.Models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // to speak to the database and give data to service
// defining the course class with its primary key which is integer type // linking
public interface LoanRepositories extends JpaRepository<Loan,Integer> {


    @Query("SELECT l from Loan l")
    List<Loan> getAllLoan();

    @Query("SELECT a from Loan a where a.id= :loanId")
    Loan getLoanById(@Param("loanId") Integer id);

}
