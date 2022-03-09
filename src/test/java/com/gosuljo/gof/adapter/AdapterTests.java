package com.gosuljo.gof.adapter;

import com.gosuljo.gof.infra.adapter.after.AccountUserDetailsService;
import com.gosuljo.gof.infra.adapter.before.AccountService;
import com.gosuljo.gof.infra.adapter.before.security.LoginHandler;
import com.gosuljo.gof.infra.adapter.before.security.UserDetailsService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AdapterTests {
    @Test
    public void adapter_test_1() {
        /*
        adaptee에 해당하는 코드
            Account
            AccountService
        Target에 해당하는 코드
            LoginHandler
        Adapter에 해당하는 코드
            AccountUserDetails
            AccountUserDetailsService
        */
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        String username = new LoginHandler(userDetailsService).login("gosuljo", "gosuljo");
        assertEquals("gosuljo", username);
    }
}
