package com.example.consumer.remote;

import com.example.consumer.remote.hystrix.UserRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider-01",fallback = UserRemoteHystrix.class)
public interface UserRemote {
    @RequestMapping("hello")
    String hello();
    @RequestMapping("word")
    String word(@RequestParam(value = "word") String word);
}
