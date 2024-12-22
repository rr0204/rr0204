package com.telusko.JobApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.JobApp.model.UserInfo;
import com.telusko.JobApp.repo.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Add a new user
    public void addUserInfo(UserInfo userInfo) {
        userRepository.save(userInfo);
    }

    // Get all users
    public List<UserInfo> returnAllUsers() {
        return userRepository.findAll();
    }

    // Get a user by ID
    public UserInfo getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public void deleteUser(int userId) {
    }
}
