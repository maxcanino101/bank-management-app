package com.maxwell.bank.management.system.mapper.impl;

import com.maxwell.bank.management.system.entity.Account;
import com.maxwell.bank.management.system.entity.Transaction;
import com.maxwell.bank.management.system.entity.TransactionType;
import com.maxwell.bank.management.system.mapper.TransactionMapper;
import com.maxwell.bank.management.system.model.transaction.TransactionResponseModel;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public Transaction toEntity(double amount, Account account, TransactionType type) {
        return Transaction
                .builder()
                .amount(amount)
                .account(account)
                .type(type)
                .timestamp(new Date())
                .notes("Account Balance" + account.getBalance())
                .build();
    }

    @Override
    public TransactionResponseModel toResponseModel(Long id, double amount, double balance) {
        return TransactionResponseModel
                .builder()
                .id(id)
                .amount(amount)
                .balance(balance)
                .build();
    }
}
