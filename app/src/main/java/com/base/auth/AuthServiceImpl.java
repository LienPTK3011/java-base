package com.base.auth;

import com.base.repository.account.AccountRepository;
import com.base.repository.user.UserRepository;
import com.base.service.auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final AccountRepository accountRepository;
    private final UserRepository userRepository;
}
