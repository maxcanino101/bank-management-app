package com.maxwell.bank.management.system.service.impl;

import com.maxwell.bank.management.system.entity.User;
import com.maxwell.bank.management.system.mapper.UserProfileMapper;
import com.maxwell.bank.management.system.model.authentication.UserProfileResponseModel;
import com.maxwell.bank.management.system.repository.UserRepository;
import com.maxwell.bank.management.system.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserProfileMapper userProfileMapper;

    @Override
    public UserProfileResponseModel getUserProfile() {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();

        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new EntityNotFoundException("User " + email + " Not Found"));

        return userProfileMapper.toUserProfile(user);
    }
}
