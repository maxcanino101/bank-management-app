package com.maxwell.bank.management.system.mapper;

import com.maxwell.bank.management.system.entity.User;
import com.maxwell.bank.management.system.model.authentication.RegisterRequestModel;

public interface UserMapper {
    User toUser(RegisterRequestModel request);
}
