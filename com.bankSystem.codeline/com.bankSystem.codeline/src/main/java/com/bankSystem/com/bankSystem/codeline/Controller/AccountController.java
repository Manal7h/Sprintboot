package com.bankSystem.com.bankSystem.codeline.Controller;

import com.bankSystem.com.bankSystem.codeline.Models.Account;
import com.bankSystem.com.bankSystem.codeline.RequestObj.AccountRequest;
import com.bankSystem.com.bankSystem.codeline.RequestObj.CreditCardRequest;
import com.bankSystem.com.bankSystem.codeline.RequestObj.CustomerRequest;
import com.bankSystem.com.bankSystem.codeline.Services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping(value = "account")

public class AccountController {

    @Autowired
    AccountServices accountServices;


    //Account Entity: 1
    @RequestMapping(value = "/createAccount" , method = RequestMethod.POST)
    public String createAccount(AccountRequest accountRequest){
        try {
            accountServices.createAccount(accountRequest);
        } catch (Exception e) {
            return "Failed Delete";
        }
        return "Delete Successfully";
    }

    @RequestMapping(value = "/getAll" , method = RequestMethod.GET) // start the connection between java and web request onto specific handeler class/method
    public List<Account> getAllAccount() {
        List<Account> account = accountServices.getAllAccount();
        return account;


//        public List<Account> getAllAccount() {
//            return accountRepositories.getAllAccount();
//        }
    }

    @RequestMapping(value = "/deleteById", method = RequestMethod.GET)
    public String deleteAccountById(AccountRequest accountRequest){
        try {
            accountServices.deleteAccountById(accountRequest);
        } catch (Exception e) {
            return "Failed Delete";
        }
        return "Delete Successfully";
    }


    //Account Entity: 2
    @RequestMapping(value = "getBalanceForAccount", method = RequestMethod.GET)
    public double getBalanceForAccount(@RequestParam Integer id) {
        return accountServices.getBalanceForAccount(id);
    }
}


