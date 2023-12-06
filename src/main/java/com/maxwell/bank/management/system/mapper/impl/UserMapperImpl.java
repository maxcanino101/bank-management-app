package com.maxwell.bank.management.system.mapper.impl;

import com.maxwell.bank.management.system.entity.Role;
import com.maxwell.bank.management.system.entity.User;
import com.maxwell.bank.management.system.mapper.UserMapper;
import com.maxwell.bank.management.system.model.authentication.RegisterRequestModel;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapperImpl implements UserMapper {

    private final PasswordEncoder passwordEncoder;

    @Override
    public User toUser(RegisterRequestModel request) {
        return User
                .builder()
                .name(request.getName())
                .role(Role.USER)
                .email(request.getEmail())
                .phone(request.getPhone())
                .password(passwordEncoder.encode(request.getPassword()))
                .build();
    }
}
