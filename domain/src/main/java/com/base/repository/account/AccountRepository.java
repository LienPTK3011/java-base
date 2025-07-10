package com.base.repository.account;

import com.base.domain.account.Account;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {
    List<Account> findAll();
    /**
     * Find account by username
     * @param username : username
     * @return optional account
     */
    Optional<Account> findByUsername(String username);

    /**
     * Check user exists by username
     * @param username : username
     * @return: user exits or not
     */
    boolean existsByUsername(String username);
}
