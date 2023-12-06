package com.maxwell.bank.management.system.mapper;

import com.maxwell.bank.management.system.entity.User;
import com.maxwell.bank.management.system.model.authentication.UserProfileResponseModel;

public interface UserProfileMapper {
    UserProfileResponseModel toUserProfile(User user);
}
