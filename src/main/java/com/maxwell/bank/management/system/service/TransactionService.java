package com.maxwell.bank.management.system.service;

import com.maxwell.bank.management.system.model.transaction.DepositRequestModel;
import com.maxwell.bank.management.system.model.transaction.TransactionResponseModel;
import com.maxwell.bank.management.system.model.transaction.WithdrawRequestModel;

public interface TransactionService {
    TransactionResponseModel deposit(DepositRequestModel request);
    TransactionResponseModel withdraw(WithdrawRequestModel request);
}