package com.base.mapper.account;

import com.base.domain.account.Account;
import com.base.entity.account.AccountEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    public AccountEntity toEntity(Account account);
    public Account toDomain(AccountEntity accountEntity);
}
