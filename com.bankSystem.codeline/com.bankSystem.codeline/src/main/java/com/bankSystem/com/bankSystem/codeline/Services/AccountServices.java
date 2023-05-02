package com.bankSystem.com.bankSystem.codeline.Services;

import com.bankSystem.com.bankSystem.codeline.Repositories.AccountRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
// This is where the business logic is done and everything related to the function and others and To give controller whatever it needs
public class AccountServices {

    @Autowired // create one instance and can be used in the entire program , no need to create obj
    AccountRepositories accountRepositories;



}
