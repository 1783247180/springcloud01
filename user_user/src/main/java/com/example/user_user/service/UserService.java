package com.example.user_user.service;

import com.example.user_common.bean.User;

public interface UserService {
    boolean login(String username,String password);
    User getUserById(int id);
}
