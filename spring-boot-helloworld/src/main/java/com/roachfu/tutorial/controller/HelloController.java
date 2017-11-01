package com.roachfu.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制层
 * @author roach
 * @datetime 2017/11/1 11:31
 */

@RestController
@RequestMapping("/hello")
public class HelloController {
    
    @GetMapping
    public String index(){
        System.out.println("Hello World Spring Boot");
        return "Hello World Spring Boot !!!";
    }
}
