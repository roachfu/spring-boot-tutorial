package com.roachfu.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author roach
 * @date 07/11/2017 22:26
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public List<Map<String, String>> get(){
        List<Map<String, String>> demos = new ArrayList<>();
        Map<String, String > demo1 = new HashMap<>();
        demo1.put("roach", "小强");
        demo1.put("crow", "乌鸦");
        demos.add(demo1);

        Map<String, String> demo2 = new HashMap<>();
        demo2.put("lion", "狮子");
        demo2.put("tiger", "老虎");
        demos.add(demo2);

        return demos;
    }
}
