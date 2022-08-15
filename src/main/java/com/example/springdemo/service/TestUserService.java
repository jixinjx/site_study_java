package com.example.springdemo.service;

import com.example.springdemo.dao.TestUserMapper;
import com.example.springdemo.entity.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestUserService {

    @Autowired
    private TestUserMapper testUserMapper;

    public TestUser findUserById(int id){
        return testUserMapper.selectid(id);
    }
}
