package com.example.dubboconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 冯浩
 * @Description
 * @Date: create in 17:08 2018/5/23
 * @Modified by
 */
@RestController
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("index")
    public String userTest(String mess){
        return userService.sayHello(mess);

    }
}    