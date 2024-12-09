package com.java.banking.repositories;

import com.java.banking.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    //query method to retrieve the transactions by account id(orderby - latest first)
    List<Transaction> findByAccountIdOrderByTimestampDesc(Long accountId);
}
