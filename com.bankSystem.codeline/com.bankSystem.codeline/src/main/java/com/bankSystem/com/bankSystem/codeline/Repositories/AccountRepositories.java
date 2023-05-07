package com.bankSystem.com.bankSystem.codeline.Repositories;

import com.bankSystem.com.bankSystem.codeline.Models.Account;
import com.bankSystem.com.bankSystem.codeline.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // to speak to the database and give data to service
// defining the course class with its primary key which is integer type // linking
public interface AccountRepositories extends JpaRepository<Account,Integer> {
}
