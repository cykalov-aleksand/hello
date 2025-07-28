package com.example.helo;

import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import java.util.Arrays;

public class CustomAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String userName=authentication.getName();
        String password=String.valueOf(authentication.getCredentials());
        if("join".equals(userName)&&"123".equals(password)){
            return new UsernamePasswordAuthenticationToken(userName,password, Arrays.asList());
        }else{
            throw new AuthenticationCredentialsNotFoundException("ERROR!");
        }

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken
                .class
                .isAssignableFrom(authentication);
    }
}
