package com.example.RelationPractice.api.controller;

import com.example.RelationPractice.api.Service.UserService;
import com.example.RelationPractice.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/geUserById/{id}")
    public User getUserByID(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/userDeletedById/{id}")
    public String userDeleteByID(@PathVariable Long id) {
        return userService.userDeleteByID(id);
    }

    @PutMapping("/updateUserByID/{id}")
    public String userUpdatedById(@PathVariable Long id, @RequestBody User user) {
        return userService.userUpdatedById(id, user);
    }


}
