package com.gosuljo.gof.infra.adapter.after;

import com.gosuljo.gof.infra.adapter.before.Account;
import com.gosuljo.gof.infra.adapter.before.AccountService;
import com.gosuljo.gof.infra.adapter.before.security.UserDetails;
import com.gosuljo.gof.infra.adapter.before.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = accountService.findAccountByUsername(username);
        return new AccountUserDetails(accountByUsername);
    }
}
