package com.rookies4.myspringboot.controller;

import com.rookies4.myspringboot.entity.UserEntity;
import com.rookies4.myspringboot.repository.CustomerRepository;
import com.rookies4.myspringboot.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserRestController {
    private final UserRepository userRepository;

    //Constructor Injection
//    public UserRestController(UserRepository userRepository) {
//        System.out.println("생성자 인젝션 " + userRepository.getClass().getName());
//        this.userRepository = userRepository;
//    }

    @PostMapping
    public UserEntity create(@RequestBody UserEntity user){
        return userRepository.save(user);
    }

    @GetMapping
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }

}
