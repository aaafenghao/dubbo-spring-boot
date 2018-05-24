package com.example.dubboproducer.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @Author 冯浩
 * @Description
 * @Date: create in 16:38 2018/5/23
 * @Modified by
 */
@Service(interfaceClass = UserService.class,version = "1.0.0")
@Component
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello(String message) {
        return "hahha"+message;
    }
}