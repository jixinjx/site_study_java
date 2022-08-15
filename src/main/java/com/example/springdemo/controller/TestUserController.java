package com.example.springdemo.controller;

import com.example.springdemo.entity.TestUser;
import com.example.springdemo.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestUserController {
    @Autowired
    private TestUserService TestUserService;
    @GetMapping(value = "/testusers/{id}")
    public TestUser getTestUsers(@PathVariable int id) {
        return TestUserService.findUserById(id);

    }
}
