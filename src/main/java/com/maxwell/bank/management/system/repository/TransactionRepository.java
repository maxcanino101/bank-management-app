package com.maxwell.bank.management.system.repository;

import com.maxwell.bank.management.system.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
