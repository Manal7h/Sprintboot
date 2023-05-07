package com.bankSystem.com.bankSystem.codeline.Services;

import com.bankSystem.com.bankSystem.codeline.Models.CreditCard;
import com.bankSystem.com.bankSystem.codeline.Models.Customer;
import com.bankSystem.com.bankSystem.codeline.Repositories.CreditCardRepositories;
import com.bankSystem.com.bankSystem.codeline.Repositories.CustomerRepositories;
import com.fasterxml.jackson.databind.node.BooleanNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
// This is where the business logic is done and everything related to the function and others and To give controller whatever it needs
public class CreditCardServices {

    @Autowired // create one instance and can be used in the entire program , no need to create obj
    CreditCardRepositories creditCardRepositories;
    CustomerRepositories customerRepositories;

    public void createCreditCard(Integer cardNumber,Double creditLimit, Integer customerId)
    {
        CreditCard creditCard = new CreditCard();


        creditCard.setCardNumber(cardNumber);
        creditCard.setCreditLimit(creditLimit);
        creditCard.setCreatedDate(new Date());
        creditCard.setUpdatedDate(new Date());
        creditCard.setActive(Boolean.TRUE);

        Customer customer = customerRepositories.findById(customerId).get();
        creditCard.setCustomer(customer);
        creditCardRepositories.save(creditCard);



    }





}
