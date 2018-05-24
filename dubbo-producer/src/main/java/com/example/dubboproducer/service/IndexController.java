package com.example.dubboproducer.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 冯浩
 * @Description
 * @Date: create in 18:13 2018/5/23
 * @Modified by
 */
@RestController
public class IndexController {

    @GetMapping("index")
    public String index(){
        return "Sucess";
    }
}    