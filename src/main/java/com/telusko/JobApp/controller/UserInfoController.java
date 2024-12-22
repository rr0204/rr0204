package com.telusko.JobApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telusko.JobApp.model.UserInfo;
import com.telusko.JobApp.service.UserService;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserInfoController {

    @Autowired
    private UserService userService;

    // ************************************************************************

    @RequestMapping("/register")
    public String registerUser() {
        return "register";  // Show registration form
    }

    // ************************************************************************

    @PostMapping("/handleUserRegistration")
    public String handleUserRegistration(UserInfo userInfo, MultipartFile resumeFile, Model model) {
        // Assuming you will handle file upload logic elsewhere
        userInfo.setResume(resumeFile.getOriginalFilename()); // Save the resume filename
        userService.addUserInfo(userInfo); // Save user info in the database
        model.addAttribute("userInfo", userInfo);
        return "registrationSuccess"; // Return success view after registration
    }

    // ************************************************************************

    @GetMapping("/viewallusers")
    public String viewAllUsers(Model model) {
        List<UserInfo> allUsers = userService.returnAllUsers();
        model.addAttribute("users", allUsers);
        return "viewallusers";  // A view to list all users
    }

    // ************************************************************************

    @RequestMapping("/userprofile")
    public ModelAndView viewUserProfile(int userId, ModelAndView mv) {
        UserInfo userInfo = userService.getUserById(userId);
        mv.addObject("userInfo", userInfo);
        mv.setViewName("userprofile");  // A view to display the user profile
        return mv;
    }
}
