package com.bankSystem.com.bankSystem.codeline.Services;

import com.bankSystem.com.bankSystem.codeline.Models.CreditCard;
import com.bankSystem.com.bankSystem.codeline.Models.Customer;
import com.bankSystem.com.bankSystem.codeline.Models.Transaction;
import com.bankSystem.com.bankSystem.codeline.Repositories.CreditCardRepositories;
import com.bankSystem.com.bankSystem.codeline.Repositories.CustomerRepositories;
import com.bankSystem.com.bankSystem.codeline.Repositories.TransactionRepositories;
import com.bankSystem.com.bankSystem.codeline.RequestObj.TransactionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
// This is where the business logic is done and everything related to the function and others and To give controller whatever it needs

public class TransactionServices {

    @Autowired // create one instance and can be used in the entire program , no need to create obj
    TransactionRepositories transactionRepositories;

    @Autowired
    CreditCardRepositories creditCardRepositories;

    public void createTransaction(TransactionRequest transactionRequest) throws ParseException {
        Transaction transaction = new Transaction();
        transaction.setAmount(transactionRequest.getAmount());

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date convertedDateFromStringTODateFormat = dateFormat.parse(transactionRequest.getTransactionDate());
        transaction.setTransactionDate(convertedDateFromStringTODateFormat);
        transaction.setTransactionDate(new Date());
        transaction.setUpdatedDate(new Date());
        transaction.setActive(Boolean.TRUE);

        CreditCard creditCard = creditCardRepositories.findById(transactionRequest.getCreditCardId()) .get();
        transaction.setCreatedDate(new Date());
        transactionRepositories.save(transaction);
    }
}

