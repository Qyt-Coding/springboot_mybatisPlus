package com.example.springboot_mybatisplus.demo;

import com.example.springboot_mybatisplus.demo.dao.UserDao;
import com.example.springboot_mybatisplus.demo.entity.User;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
//@MapperScan("com.example.springboot_mybatisplus.demo.dao")
class DemoApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
        List<User> users=userDao.selectList(null);
        users.forEach(user->System.out.println("user  "+user));
    }

    @Test
    void selectCount() {
        Integer i=userDao.selectCount();
       System.out.println(i+"+++++++++++++++++++++");
    }

}
