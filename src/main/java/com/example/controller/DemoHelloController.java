package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoHelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
