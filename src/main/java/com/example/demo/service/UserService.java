package com.example.demo.service;

import com.example.demo.modelanddto.User;
import com.example.demo.modelanddto.UserRequest;
import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    // Test comment

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.name().upperCase());
        user.setAge(userRequest.age());
        //TestComment
        return userRepository.save(user);
    }
}
