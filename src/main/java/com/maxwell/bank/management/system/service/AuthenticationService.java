package com.maxwell.bank.management.system.service;

import com.maxwell.bank.management.system.model.authentication.AuthenticationResponseModel;
import com.maxwell.bank.management.system.model.authentication.RegisterRequestModel;
import com.maxwell.bank.management.system.model.authentication.LoginRequestModel;

public interface AuthenticationService {
    public AuthenticationResponseModel register(RegisterRequestModel request);

    public AuthenticationResponseModel login(LoginRequestModel request);
}
