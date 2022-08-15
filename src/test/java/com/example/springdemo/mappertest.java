package com.example.springdemo;
import com.example.springdemo.dao.TestUserMapper;
import com.example.springdemo.entity.TestUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


@SpringBootTest
@ContextConfiguration(classes = SpringdemoApplication.class)
public class mappertest {
    @Autowired
    private TestUserMapper testUserMapper;

    @Test
    public void test1(){
        TestUser testUser =testUserMapper.selectid(1);
        System.out.println(testUser.getUsername());
    }
}
