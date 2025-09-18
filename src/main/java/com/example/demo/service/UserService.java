package com.example.demo.service;

import com.example.demo.modelanddto.User;
import com.example.demo.modelanddto.UserRequest;
import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .filter(user -> user.getAge() >= 18)
                .toList();
    }

    public User createUser(UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.name());
        user.setEmail(userRequest.email());
        user.setAge(userRequest.age());
        return userRepository.save(user);
    }
}
