package com.rest.SpringBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;

public class AuthProvider implements AuthenticationProvider {
    @Autowired private SecurityStudentsDetailsService studentsDetailsService;
    @Autowired private PasswordEncoder passwordEncoder;
    @Autowired private StudentRepository studentRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
