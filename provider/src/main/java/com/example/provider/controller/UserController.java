package com.example.provider.controller;

import com.example.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        return userService.hello();
    }
    @RequestMapping("/word")
    public String word(@RequestParam(value = "word") String word){
        return userService.word(word);
    }

}
