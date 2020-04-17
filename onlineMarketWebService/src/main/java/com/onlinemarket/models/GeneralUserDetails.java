package com.onlinemarket.models;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class GeneralUserDetails implements UserDetails {
    private String email;
    private String pass;
    List<GrantedAuthority> authorities;
    public GeneralUserDetails(User user){
        this.email = user.getEmail();
        this.pass = user.getPassword();
        List<GrantedAuthority> list = new ArrayList();
        list.add(new SimpleGrantedAuthority("ROLE_" + user.getUserType().toUpperCase()));
        this.authorities = list;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return pass;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
