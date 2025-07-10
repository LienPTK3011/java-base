package com.base.service.account;

import com.base.domain.account.Account;

import java.util.Optional;

public interface AccountService {
    public Optional<Account> findByUsername(String username);

}
