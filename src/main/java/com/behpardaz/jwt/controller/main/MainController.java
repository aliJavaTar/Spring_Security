package com.behpardaz.jwt.controller.main;

import com.behpardaz.jwt.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private final UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public String indexPage() {
        return "index";
    }
}
