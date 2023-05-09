package com.bankSystem.com.bankSystem.codeline.Controller;

import com.bankSystem.com.bankSystem.codeline.Models.Account;
import com.bankSystem.com.bankSystem.codeline.Services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping(value = "account")

public class AccountController {

    @Autowired
    AccountServices accountServices;

    @RequestMapping(value = "/getAll" , method = RequestMethod.GET) // start the connection between java and web request onto specific handeler class/method
    public List<Account> getAllAccount() {
        List<Account> account = accountServices.getAllAccount();
        return account;


//        public List<Account> getAllAccount() {
//            return accountRepositories.getAllAccount();
//        }
    }



}
