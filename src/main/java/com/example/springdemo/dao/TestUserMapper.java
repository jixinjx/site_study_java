package com.example.springdemo.dao;

import com.example.springdemo.entity.TestUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestUserMapper {
    TestUser selectid(int idtestuser);

}
