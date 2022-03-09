package com.gosuljo.gof.infra.adapter.before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
