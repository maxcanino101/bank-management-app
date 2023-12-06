package com.maxwell.bank.management.system.service;

import com.maxwell.bank.management.system.model.account.AccountResponseModel;
import com.maxwell.bank.management.system.model.account.CreateAccountModel;

import java.util.List;

public interface AccountService {
    AccountResponseModel createNewAccount(CreateAccountModel request);

    List<AccountResponseModel> getMyAccounts();
}
