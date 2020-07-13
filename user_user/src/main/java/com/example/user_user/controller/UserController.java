package com.example.user_user.controller;

import com.example.user_common.bean.User;
import com.example.user_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
@RequestMapping("/login")
    public boolean login(@RequestParam("username") String username,@RequestParam("password") String password){
    return userService.login(username,password);
}
    @RequestMapping("/getUserById")
    public String getUserById(int id){
        User user = userService.getUserById(id);
        if(user == null){
            return null;
        }else{
            return user.toString();
        }
    }
}
