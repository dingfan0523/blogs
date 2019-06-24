package com.pingfan.parent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("name")
    public String test(@RequestParam(value = "name") String name) {
        System.out.println("进入控制器");
        return name;
    }
}
