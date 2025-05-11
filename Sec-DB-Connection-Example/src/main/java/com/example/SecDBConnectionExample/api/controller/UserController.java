package com.example.SecDBConnectionExample.api.controller;

import com.example.SecDBConnectionExample.api.Service.UserService;
import com.example.SecDBConnectionExample.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user,user.getContactDetails());
    }

}
