package com.rookies4.myspringboot.controller;

import com.rookies4.myspringboot.repository.CustomerRepository;
import com.rookies4.myspringboot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserRestController {
    private final UserRepository userRepository;

    //Constructor Injection
//    public UserRestController(UserRepository userRepository) {
//        System.out.println("생성자 인젝션 " + userRepository.getClass().getName());
//        this.userRepository = userRepository;
//    }
}
