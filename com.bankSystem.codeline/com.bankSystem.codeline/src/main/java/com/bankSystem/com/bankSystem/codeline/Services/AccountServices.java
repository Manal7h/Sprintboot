package com.bankSystem.com.bankSystem.codeline.Services;

import com.bankSystem.com.bankSystem.codeline.Models.Account;
import com.bankSystem.com.bankSystem.codeline.Models.Customer;
import com.bankSystem.com.bankSystem.codeline.Repositories.AccountRepositories;
import com.bankSystem.com.bankSystem.codeline.Repositories.CustomerRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
// This is where the business logic is done and everything related to the function and others and To give controller whatever it needs
public class AccountServices {

    @Autowired // create one instance and can be used in the entire program , no need to create obj
    AccountRepositories accountRepositories;

    @Autowired
    CustomerRepositories customerRepositories;


    public void createAccount( Double balance, Integer accountNumber , Integer customerId)
    {
        Account account = new Account();
        account.setBalance(balance);
        account.setAccountNumber(accountNumber);
        account.setCreatedDate(new Date());
        account.setUpdatedDate(new Date());
        account.setActive(Boolean.TRUE);


        Customer customer = customerRepositories.findById(customerId).get();
        account.setCustomer(customer);
        accountRepositories.save(account);









    }



}

