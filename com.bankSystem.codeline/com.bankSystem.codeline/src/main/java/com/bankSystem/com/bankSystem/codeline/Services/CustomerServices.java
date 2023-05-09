package com.bankSystem.com.bankSystem.codeline.Services;

import com.bankSystem.com.bankSystem.codeline.Models.CreditCard;
import com.bankSystem.com.bankSystem.codeline.Models.Customer;
import com.bankSystem.com.bankSystem.codeline.Models.Loan;
import com.bankSystem.com.bankSystem.codeline.Repositories.CustomerRepositories;
import com.bankSystem.com.bankSystem.codeline.RequestObj.CreditCardRequest;
import com.bankSystem.com.bankSystem.codeline.RequestObj.CustomerRequest;
import com.bankSystem.com.bankSystem.codeline.RequestObj.LoanRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
// This is where the business logic is done and everything related to the function and others and To give controller whatever it needs
public class CustomerServices {

    @Autowired // create one instance and can be used in the entire program , no need to create obj
    CustomerRepositories customerRepositories;

//create
//    public void createCustomer(String customerName,String customerEmail,Integer customerPhone){
//        Customer customer = new Customer();
//        customer.setCustomerName(customerName);
//        customer.setCustomerEmail(customerEmail);
//        customer.setCustomerPhone(customerPhone);
//        customer.setCreatedDate(new Date());
//        customer.setUpdatedDate(new Date());
//        customer.setActive(Boolean.TRUE);
//        customerRepositories.save(customer);
//
//    }

    public void createCustomer(CustomerRequest customerRequest){
    Customer customer = CustomerRequest.convert(customerRequest);

    customerRepositories.save(customer);
    }

    public void upDateCustomer(CustomerRequest customerRequest){
        Customer customer = CustomerRequest.convert(customerRequest);
        customer.setUpdatedDate(new Date());
        customerRepositories.save(customer);
    }

    public List<Customer> getAllCustomer() {
        return customerRepositories.getAllCustomer();
    }

    public void deleteCustomerById(CustomerRequest customerRequest) {
        Customer customer = customerRepositories.getCustomerById(customerRequest.getId());
        customer.setActive(Boolean.FALSE);
        customerRepositories.save(customer);

    }
}



