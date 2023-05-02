package com.bankSystem.com.bankSystem.codeline.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // to speak to the database and give data to service
// defining the course class with its primary key which is integer type // linking
public interface LoanRepositories extends JpaRepository<Long,Integer> {

}
