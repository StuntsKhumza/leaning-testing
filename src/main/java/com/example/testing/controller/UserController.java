package com.example.testing.controller;

import com.example.testing.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping(path = "/user/{id}")
    public String getUser(@PathVariable Long id) {
        return userService.fetchUserName(id);
    }


}
