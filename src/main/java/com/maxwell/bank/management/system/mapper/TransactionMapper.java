package com.maxwell.bank.management.system.mapper;

import com.maxwell.bank.management.system.entity.Account;
import com.maxwell.bank.management.system.entity.Transaction;
import com.maxwell.bank.management.system.entity.TransactionType;
import com.maxwell.bank.management.system.model.transaction.TransactionResponseModel;

public interface TransactionMapper {
    Transaction toEntity(double amount, Account account, TransactionType type);
    TransactionResponseModel toResponseModel(Long id, double amount, double balance);
}
