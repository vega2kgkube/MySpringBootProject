package com.rookies4.myspringboot.controller;

import com.rookies4.myspringboot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserServiceRestController {
    private final UserService userService;
}
