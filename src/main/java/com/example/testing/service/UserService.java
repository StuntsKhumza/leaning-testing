package com.example.testing.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String fetchUserName(final long Id) {

        if (Id == 1) {
            return "Username: Nathi";
        } else {
            return "Error, user not found";
        }
    }
}
