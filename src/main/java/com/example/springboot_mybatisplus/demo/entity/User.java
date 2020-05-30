package com.example.springboot_mybatisplus.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
//@AllArgsConstructor
//@ToString
@TableName()//默认将类名做为表名
public class User {
    Integer id;
    String username;
    Date birthday;
    String sex;
    String address;
}
