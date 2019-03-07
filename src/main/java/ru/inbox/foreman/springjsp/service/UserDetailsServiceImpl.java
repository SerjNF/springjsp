package ru.inbox.foreman.springjsp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.inbox.foreman.springjsp.model.User;
import ru.inbox.foreman.springjsp.model.UserRoleEnum;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;


    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = userService.getUser(login);

        Set<GrantedAuthority> roles = new HashSet<>();
        roles.add(new SimpleGrantedAuthority(UserRoleEnum.USER.name()));

        UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUserLogin(), user.getUserPassword(), roles);

        return userDetails;

    }
}
