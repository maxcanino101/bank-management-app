package com.maxwell.bank.management.system.service.impl;

import com.maxwell.bank.management.system.entity.Account;
import com.maxwell.bank.management.system.entity.User;
import com.maxwell.bank.management.system.mapper.AccountMapper;
import com.maxwell.bank.management.system.model.account.AccountResponseModel;
import com.maxwell.bank.management.system.model.account.CreateAccountModel;
import com.maxwell.bank.management.system.repository.AccountRepository;
import com.maxwell.bank.management.system.repository.UserRepository;
import com.maxwell.bank.management.system.service.AccountService;
import com.maxwell.bank.management.system.utils.Utils;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final UserRepository userRepository;
    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    @Override
    public AccountResponseModel createNewAccount(CreateAccountModel request) {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();

        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new EntityNotFoundException("User " + email + " Not Found"));

        Account account = accountRepository.save(
                Account
                        .builder()
                        .cardNumber(generateUniqueCardNumber())
                        .cvv(Utils.generateCVV())
                        .balance(0.0)
                        .user(user)
                        .build()
        );

        return accountMapper.toResponseModel(account);
    }

    @Override
    public List<AccountResponseModel> getMyAccounts() {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();

        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new EntityNotFoundException("User " + email + " Not Found"));

        return accountRepository
                .findAllByUser(user)
                .stream()
                .map(accountMapper::toResponseModel)
                .toList();
    }

    public String generateUniqueCardNumber() {
        String cardNumber = Utils.generateCardNumber();

        while (accountRepository.existsByCardNumber(cardNumber)) {
            cardNumber = Utils.generateCardNumber();
        }

        return cardNumber;
    }
}