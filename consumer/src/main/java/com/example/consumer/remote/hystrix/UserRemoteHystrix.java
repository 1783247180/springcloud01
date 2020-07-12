package com.example.consumer.remote.hystrix;

import com.example.consumer.remote.UserRemote;
import org.springframework.stereotype.Component;

@Component
public class UserRemoteHystrix implements UserRemote {
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String word(String word) {
        return "error";
    }
}
