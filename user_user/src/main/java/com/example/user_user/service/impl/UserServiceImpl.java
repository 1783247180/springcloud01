package com.example.user_user.service.impl;


import com.example.user_common.bean.User;
import com.example.user_common.mapper.UserMapper;
import com.example.user_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
@CacheConfig(cacheNames = "c1")
@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserMapper userMapper;

    @Override
    public boolean login(String username,String password){
    User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        User login = userMapper.login(user);
        if(login == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    @Cacheable(key = "#id")
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
