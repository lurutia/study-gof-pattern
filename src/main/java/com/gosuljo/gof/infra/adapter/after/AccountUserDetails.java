package com.gosuljo.gof.infra.adapter.after;

import com.gosuljo.gof.infra.adapter.before.Account;
import com.gosuljo.gof.infra.adapter.before.security.UserDetails;

public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
