package com.bankSystem.com.bankSystem.codeline.Services;

import com.bankSystem.com.bankSystem.codeline.Models.Account;
import com.bankSystem.com.bankSystem.codeline.Models.Customer;
import com.bankSystem.com.bankSystem.codeline.Repositories.AccountRepositories;
import com.bankSystem.com.bankSystem.codeline.Repositories.CustomerRepositories;
import com.bankSystem.com.bankSystem.codeline.RequestObj.AccountRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
// This is where the business logic is done and everything related to the function and others and To give controller whatever it needs
public class AccountServices {

    @Autowired // create one instance and can be used in the entire program , no need to create obj
    AccountRepositories accountRepositories;

    @Autowired
    CustomerRepositories customerRepositories;


//    public void createAccount( Double balance, Integer accountNumber , Integer customerId)
//    {
//        Account account = new Account();
//        account.setBalance(balance);
//        account.setAccountNumber(accountNumber);
//        account.setCreatedDate(new Date());
//        account.setUpdatedDate(new Date());
//        account.setActive(Boolean.TRUE);
//
//
//        Customer customer = customerRepositories.findById(customerId).get();
//        account.setCustomer(customer);
//        accountRepositories.save(account);
//
//
//    }
    //Create
    public void createAccount(AccountRequest accountRequest){
       Account account = AccountRequest.convert(accountRequest);
       Customer customer = customerRepositories.findById(accountRequest.getCustomerId()).get();
       account.setCustomer(customer);
       accountRepositories.save(account);
    }

    //Up
    public void upDateAccount(AccountRequest accountRequest){
        Account account = AccountRequest.convert(accountRequest);
        Customer customer = customerRepositories.findById(accountRequest.getCustomerId()).get();
        account.setCustomer(customer);
        account.setUpdatedDate(new Date());
        accountRepositories.save(account);
    }


    //Read
    public List<Account> getAllAccount() {
        return accountRepositories.getAllAccount();
    }


    public void deleteAccountById(AccountRequest accountRequest) {
        Account account = accountRepositories.getAccountById(accountRequest.getId());
        account.setActive(Boolean.FALSE);
        accountRepositories.save(account);

    }

    //Account Entity: 2

    public double getBalanceForAccount(Integer id) {
        return accountRepositories.getBalanceForAccount(id);

    }
}

