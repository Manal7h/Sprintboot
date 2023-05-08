package com.bankSystem.com.bankSystem.codeline.Controller;

import com.bankSystem.com.bankSystem.codeline.Models.Customer;
import com.bankSystem.com.bankSystem.codeline.Models.Loan;
import com.bankSystem.com.bankSystem.codeline.Services.LoanServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping (value = "loan")
public class LoanController {

    @Autowired
    LoanServices loanServices;

    @RequestMapping(value = "/getAll" , method = RequestMethod.GET)
    public List<Loan> getAllLoan() {
        List<Loan> loan = loanServices.getAllLoan();
        return loan;

    }
}
