package com.bankSystem.com.bankSystem.codeline.Controller;

import com.bankSystem.com.bankSystem.codeline.Models.CreditCard;
import com.bankSystem.com.bankSystem.codeline.Models.Customer;
import com.bankSystem.com.bankSystem.codeline.Repositories.CustomerRepositories;
import com.bankSystem.com.bankSystem.codeline.Services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping(value = "customer")
public class CustomerController {

    @Autowired
    CustomerServices customerServices;


    @RequestMapping(value = "/getAll" , method = RequestMethod.GET)
    public List<Customer> getAllCustomer() {
        List<Customer> customer = customerServices.getAllCustomer();
        return customer;

    }
}
