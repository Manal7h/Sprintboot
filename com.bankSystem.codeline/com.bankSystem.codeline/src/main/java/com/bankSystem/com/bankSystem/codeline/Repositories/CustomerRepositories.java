package com.bankSystem.com.bankSystem.codeline.Repositories;


import com.bankSystem.com.bankSystem.codeline.Models.CreditCard;
import com.bankSystem.com.bankSystem.codeline.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // to speak to the database and give data to service
// defining the course class with its primary key which is integer type // linking
public interface CustomerRepositories extends JpaRepository<Customer,Integer> {


    @Query("SELECT c from Customer c")
    List<Customer> getAllCustomer();

    @Query("SELECT a from Customer a where a.id= :customerId")
    Customer getCustomerById(@Param("customerId") Integer id);
}
