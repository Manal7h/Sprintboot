package com.bankSystem.com.bankSystem.codeline.Services;

import com.bankSystem.com.bankSystem.codeline.Models.Account;
import com.bankSystem.com.bankSystem.codeline.Models.CreditCard;
import com.bankSystem.com.bankSystem.codeline.Models.Customer;
import com.bankSystem.com.bankSystem.codeline.Repositories.CreditCardRepositories;
import com.bankSystem.com.bankSystem.codeline.Repositories.CustomerRepositories;
import com.bankSystem.com.bankSystem.codeline.RequestObj.AccountRequest;
import com.bankSystem.com.bankSystem.codeline.RequestObj.CreditCardRequest;
import com.fasterxml.jackson.databind.node.BooleanNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
// This is where the business logic is done and everything related to the function and others and To give controller whatever it needs
public class CreditCardServices {

    @Autowired // create one instance and can be used in the entire program , no need to create obj
    CreditCardRepositories creditCardRepositories;
    @Autowired
    CustomerRepositories customerRepositories;



    //Account Entity: 1
    public void createCreditCard(CreditCardRequest creditCardRequest){
            CreditCard creditCard = CreditCardRequest.convert(creditCardRequest);
            Customer customer = customerRepositories.findById(creditCardRequest.getCustomerId()).get();
            creditCard.setCustomer(customer);
            creditCardRepositories.save(creditCard);
    }

    public void updateCreditCard(CreditCardRequest creditCardRequest){
        CreditCard creditCard = CreditCardRequest.convert(creditCardRequest);
        Customer customer = customerRepositories.findById(creditCardRequest.getCustomerId()).get();
        creditCard.setCustomer(customer);
        creditCard.setUpdatedDate(new Date());
        creditCardRepositories.save(creditCard);
    }

    public List<CreditCard> getAllCreditCard() {
        return creditCardRepositories.getAllCreditCard();
    }

    public void deleteCreditCardById(CreditCardRequest creditCardRequest) {
        CreditCard creditCard = creditCardRepositories.getCreditCardById(creditCardRequest.getId());
        creditCard.setActive(Boolean.FALSE);
        creditCardRepositories.save(creditCard);

        //creditCardServices.deleteCreditCardById(creditCardRequest);
    }




}
