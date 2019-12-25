package com.cskaoyan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${file.path}")
    String str;

    @RequestMapping("hello")
    public String hello(){
        return "hello" + str;
    }
}
