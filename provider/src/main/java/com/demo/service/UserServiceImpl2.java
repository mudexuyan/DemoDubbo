package com.demo.service;

import demo.UserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "2.0")
public class UserServiceImpl2 implements UserService {
    public String getUser(){
        return "user2.0";
    }
}
