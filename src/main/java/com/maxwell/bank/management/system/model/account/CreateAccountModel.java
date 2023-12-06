package com.maxwell.bank.management.system.model.account;

import jakarta.validation.constraints.NotNull;

public class CreateAccountModel {
    @NotNull(message = "accounType is required")
    private String accountType;
}
