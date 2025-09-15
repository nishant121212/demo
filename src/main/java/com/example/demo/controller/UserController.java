package com.example.demo.controller;

import com.example.demo.modelanddto.User;
import com.example.demo.modelanddto.UserRequest;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService UserService;

    @GetMapping
    public List<User> getAllUsers() {
        return UserService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody UserRequest userRequest) {
        return UserService.createUser(userRequest);
    }
}
