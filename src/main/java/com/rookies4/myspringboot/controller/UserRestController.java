package com.rookies4.myspringboot.controller;

import com.rookies4.myspringboot.repository.UserRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
    private UserRepository userRepository;

    //Constructor Injection
    public UserRestController(UserRepository userRepository) {
        System.out.println("생성자 인젝션 " + userRepository.getClass().getName());
        this.userRepository = userRepository;
    }
}
