package com.maxwell.bank.management.system.mapper;

import com.maxwell.bank.management.system.entity.Account;
import com.maxwell.bank.management.system.model.account.AccountResponseModel;

public interface AccountMapper {
    AccountResponseModel toResponseModel(Account account);
}
