package com.base.account;

import com.base.domain.account.Account;
import com.base.repository.account.AccountRepository;
import com.base.service.account.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Override
    public Optional<Account> findByUsername(String username) {
        return this.accountRepository.findByUsername(username);
    }
}
