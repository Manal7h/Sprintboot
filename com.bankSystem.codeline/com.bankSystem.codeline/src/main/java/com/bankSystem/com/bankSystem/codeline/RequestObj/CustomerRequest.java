package com.bankSystem.com.bankSystem.codeline.RequestObj;

import com.bankSystem.com.bankSystem.codeline.Models.Customer;
import com.bankSystem.com.bankSystem.codeline.Models.Loan;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Data
public class CustomerRequest {

    Integer id;
    String customerName;
    String customerEmail;
    Integer customerPhone;

    public static Customer convert(CustomerRequest request){
        Customer customer = new Customer();
        customer.setCustomerName(request.getCustomerName());
        customer.setCustomerEmail(request.getCustomerEmail());
        customer.setCustomerPhone(request.getCustomerPhone());

        customer.setCreatedDate(new Date());
        customer.setActive(Boolean.TRUE);

        return customer;



    }


}

