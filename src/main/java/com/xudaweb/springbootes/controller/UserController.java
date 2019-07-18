package com.xudaweb.springbootes.controller;

import com.xudaweb.springbootes.esentity.UserInfo;
import com.xudaweb.springbootes.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    TestService testService;

    @GetMapping("/user/{id}")
    public UserInfo getUserInfo(@PathVariable Long id) {
        return testService.getUserInfo(id);
    }
}
