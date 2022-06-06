package com.demo.service;

import demo.UserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0")
public class UserServiceImpl implements UserService {
    public String getUser(){
        return "user1.0";
    }
}
