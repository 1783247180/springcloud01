package com.example.consumer.controller;

import com.example.consumer.remote.UserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRemote userRemoteHystrix;
    @RequestMapping("hello")
    public String hello(){
        return userRemoteHystrix.hello();
    }
    @RequestMapping("word")
    public String word(@RequestParam("word") String word){
        return userRemoteHystrix.word(word);
    }
}
