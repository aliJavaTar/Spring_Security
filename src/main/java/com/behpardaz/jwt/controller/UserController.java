package com.behpardaz.jwt.controller;

import com.behpardaz.jwt.entity.User;
import com.behpardaz.jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public List<User> userPage() {
        return userService.findAll();
    }

    @PostMapping("/admin")
    public void admin() {

    }

    @PostMapping("/login")
    public User loginUser(@RequestBody User user)
    {
        return userService.createUser(user);
    }
}
