package com.example.user_common.mapper;

import com.example.user_common.bean.User;

public interface UserMapper {
    User login(User user);
    User getUserById(int id);
}
