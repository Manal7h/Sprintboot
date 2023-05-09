package com.bankSystem.com.bankSystem.codeline.Controller;

import com.bankSystem.com.bankSystem.codeline.Models.Account;
import com.bankSystem.com.bankSystem.codeline.Models.CreditCard;
import com.bankSystem.com.bankSystem.codeline.RequestObj.CreditCardRequest;
import com.bankSystem.com.bankSystem.codeline.RequestObj.CustomerRequest;
import com.bankSystem.com.bankSystem.codeline.Services.CreditCardServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "creditCard")

public class CreditCardController {

    @Autowired
    CreditCardServices creditCardServices;


    @RequestMapping(value = "/createCreditCard" , method = RequestMethod.GET)
    public String createCreditCard(CreditCardRequest creditCardRequest){
        try {
            creditCardServices.createCreditCard(creditCardRequest);
        } catch (Exception e) {
            return "Failed Delete";
        }
        return "Delete Successfully";
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<CreditCard> getAllCreditCard() {
        List<CreditCard> creditCards = creditCardServices.getAllCreditCard();
        return creditCards;
    }


    @RequestMapping(value = "/deleteById", method = RequestMethod.GET)
    public String deleteCreditCardById(CreditCardRequest creditCardRequest) {
        try {
            creditCardServices.deleteCreditCardById(creditCardRequest);
        } catch (Exception e) {
            return "Failed Delete";
        }
        return "Delete Successfully";
    }
}

