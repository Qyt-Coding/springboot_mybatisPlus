package com.example.springboot_mybatisplus.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot_mybatisplus.demo.entity.User;

public interface UserDao extends BaseMapper<User> {
    Integer selectCount();
}
