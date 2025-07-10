package com.base.repository.account;

import com.base.entity.account.AccountEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface JpaAccountRepository extends JpaRepository<AccountEntity, String> {
    Page<AccountEntity> findAll(Pageable pageable);
    List<AccountEntity> findAll();
    Optional<AccountEntity> findByUsername(String username);
    boolean existsByUsername(String username);
}
