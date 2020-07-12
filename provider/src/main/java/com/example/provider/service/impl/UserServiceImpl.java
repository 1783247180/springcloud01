package com.example.provider.service.impl;

import com.example.provider.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String hello(){
        return "hello world";
    }

    @Override
    public String word(String word) {
        return word;
    }
}
