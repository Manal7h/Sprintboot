package com.bankSystem.com.bankSystem.codeline.Services;

import com.bankSystem.com.bankSystem.codeline.Models.Customer;
import com.bankSystem.com.bankSystem.codeline.Models.Loan;
import com.bankSystem.com.bankSystem.codeline.Repositories.LoanRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
// This is where the business logic is done and everything related to the function and others and To give controller whatever it needs
public class LoanServices {

    @Autowired // create one instance and can be used in the entire program , no need to create obj
    LoanRepositories loanRepositories;

    //create
//    public void CreateLoan(Double amount, Double insertRate){
//        Loan loan = new Loan();
//        loan.setAmount(amount);
//        loan.setInsertRate(insertRate);
//        loan.setCreatedDate(new Date());
//        loan.setUpdatedDate(new Date());
//        loan.setActive(Boolean.TRUE);
//
//
//    }

}
