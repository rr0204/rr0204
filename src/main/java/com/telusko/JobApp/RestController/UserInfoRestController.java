package com.telusko.JobApp.RestController;

import com.telusko.JobApp.model.UserInfo;
import com.telusko.JobApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")  // Base URL for APIs related to users
public class UserInfoRestController {

    @Autowired
    private UserService userService;

    // Get all users
    @GetMapping("/userInfos")
    public List<UserInfo> getAllUsers() {
        return userService.returnAllUsers();
    }

    // Get a specific user by ID
    @GetMapping("/userInfo/{userId}")
    public UserInfo getUser(@PathVariable int userId) {
        return userService.getUserById(userId);
    }

    // Add a new user
    @PostMapping("/userInfo")
    public UserInfo addUser(@RequestBody UserInfo userInfo) {
        userService.addUserInfo(userInfo);
        return userService.getUserById(userInfo.getUserId());
    }

    // Update an existing user
    @PutMapping("/userInfo")
    public UserInfo updateUser(@RequestBody UserInfo userInfo) {
        userService.addUserInfo(userInfo);
        return userService.getUserById(userInfo.getUserId());
    }

    // Delete a user by ID
    @DeleteMapping("/userInfo/{userId}")
    public String deleteUser(@PathVariable int userId) {
        userService.deleteUser(userId);
        return "Deleted";
    }
}
