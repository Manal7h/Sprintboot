package com.bankSystem.com.bankSystem.codeline.Controller;


import com.bankSystem.com.bankSystem.codeline.Models.Transaction;
import com.bankSystem.com.bankSystem.codeline.RequestObj.LoanRequest;
import com.bankSystem.com.bankSystem.codeline.RequestObj.TransactionRequest;
import com.bankSystem.com.bankSystem.codeline.Services.TransactionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping (value = "transaction")
public class TransactionController {

    @Autowired
    TransactionServices transactionServices;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Transaction> getAllTransaction() {
        List<Transaction> transaction = transactionServices.getAllTransaction();
        return transaction;
    }

    @RequestMapping(value = "/deleteById", method = RequestMethod.GET)
    public String deleteTransactionById(TransactionRequest transactionRequest) {
        try {
            transactionServices.deleteTransactionById(transactionRequest);
        } catch (Exception e) {
            return "Failed Delete";
        }
        return "Delete Successfully";
    }

}
