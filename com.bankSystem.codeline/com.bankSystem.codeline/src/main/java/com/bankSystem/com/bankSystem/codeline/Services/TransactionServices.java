package com.bankSystem.com.bankSystem.codeline.Services;

import com.bankSystem.com.bankSystem.codeline.Models.*;
import com.bankSystem.com.bankSystem.codeline.Repositories.AccountRepositories;
import com.bankSystem.com.bankSystem.codeline.Repositories.CreditCardRepositories;
import com.bankSystem.com.bankSystem.codeline.Repositories.CustomerRepositories;
import com.bankSystem.com.bankSystem.codeline.Repositories.TransactionRepositories;
import com.bankSystem.com.bankSystem.codeline.RequestObj.LoanRequest;
import com.bankSystem.com.bankSystem.codeline.RequestObj.TransactionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
// This is where the business logic is done and everything related to the function and others and To give controller whatever it needs

public class TransactionServices {

    @Autowired // create one instance and can be used in the entire program , no need to create obj
    TransactionRepositories transactionRepositories;

//    @Autowired
//    CreditCardRepositories creditCardRepositories;

    @Autowired
    AccountRepositories accountRepositories;


    public void createTransaction3(TransactionRequest transactionRequest) throws ParseException {
        Transaction transaction = TransactionRequest.convert(transactionRequest);
//        CreditCard creditCard = creditCardRepositories.findById(transactionRequest.getCreditCardId()).get();
//        transaction.setCreditCard(creditCard);
        Account account = accountRepositories.findById(transactionRequest.getAccountNumber()).get();
        transaction.setAccount(account);
        transactionRepositories.save(transaction);

    }

    public void upDateTransaction(TransactionRequest transactionRequest) throws ParseException {
        Transaction transaction = TransactionRequest.convert(transactionRequest);
//        CreditCard creditCard = creditCardRepositories.findById(transactionRequest.getCreditCardId()).get();
//        transaction.setCreditCard(creditCard);
        Account account = accountRepositories.findById(transactionRequest.getAccountNumber()).get();
        transaction.setAccount(account);

        transaction.setUpdatedDate(new Date());
        transactionRepositories.save(transaction);

    }

    public List<Transaction> getAllTransaction() {
        return transactionRepositories.getAllTransaction();
    }

    public void deleteTransactionById(TransactionRequest transactionRequest) {
        Transaction transaction = transactionRepositories.getTransactionById(transactionRequest.getId());
        transaction.setActive(Boolean.FALSE);
        transactionRepositories.save(transaction);

    }


    //Account Entity: 3
    public String createTransaction(TransactionRequest transactionRequest){
        Transaction transaction=new Transaction();
        transaction.setAmount(transactionRequest.getAmount());
        Integer id = accountRepositories.getAccountByAccountNumber(transactionRequest.getAccountNumber());
        Account account=accountRepositories.findById(id).get();
        transaction.setActive(account.getActive()); // if account is active then transaction is active
        transaction.setAccount(account);
        Double transactionAmount= transactionRequest.getAmount();
        Double accountBalance=account.getBalance();
        Double newBalance=accountBalance-transactionAmount;
        account.setBalance(newBalance);
        accountRepositories.save(account);
        transactionRepositories.save(transaction);
        return "Transaction done successfully";

    }


}

