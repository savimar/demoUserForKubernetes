package ru.savimar.demouserforkube.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService
{
    @Autowired
    public PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        List<UserDetails> userDetailsList = populateUserDetails();

        for (UserDetails u : userDetailsList)
        {
            if (u.getUsername().equals(username))
            {
                return u;
            }
        }
        return null;
    }

    public List<UserDetails> populateUserDetails()
    {
        List<UserDetails> userDetailsList = new ArrayList<>();
        userDetailsList
                .add(User.withUsername("USER").password(passwordEncoder.encode("pass")).roles("USER").build());


        return userDetailsList;
    }

}