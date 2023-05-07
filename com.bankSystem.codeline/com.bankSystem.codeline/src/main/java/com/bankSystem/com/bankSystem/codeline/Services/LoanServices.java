package com.bankSystem.com.bankSystem.codeline.Services;

import com.bankSystem.com.bankSystem.codeline.Models.CreditCard;
import com.bankSystem.com.bankSystem.codeline.Models.Customer;
import com.bankSystem.com.bankSystem.codeline.Models.Loan;
import com.bankSystem.com.bankSystem.codeline.Repositories.CustomerRepositories;
import com.bankSystem.com.bankSystem.codeline.Repositories.LoanRepositories;
import com.bankSystem.com.bankSystem.codeline.RequestObj.CreditCardRequest;
import com.bankSystem.com.bankSystem.codeline.RequestObj.LoanRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
// This is where the business logic is done and everything related to the function and others and To give controller whatever it needs
public class LoanServices {

    @Autowired // create one instance and can be used in the entire program , no need to create obj
    LoanRepositories loanRepositories;
    @Autowired
    CustomerRepositories customerRepositories;


    public void createLoan(LoanRequest loanRequest) {
        Loan loan = LoanRequest.convert(loanRequest);
        Customer customer = customerRepositories.findById(loanRequest.getCustomerId()).get();
        loan.setCustomer(customer);
        loanRepositories.save(loan);


    }

    public void updateLoan(LoanRequest loanRequest) {
        Loan loan = LoanRequest.convert(loanRequest);
        Customer customer = customerRepositories.findById(loanRequest.getCustomerId()).get();
        loan.setCustomer(customer);
        loan.setUpdatedDate(new Date());
        loanRepositories.save(loan);

    }

}
