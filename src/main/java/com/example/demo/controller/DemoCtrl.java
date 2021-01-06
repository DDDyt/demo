package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCtrl {

    @GetMapping("/hello")
    public String hello(){
        return "hello GitHub";
    }

    @GetMapping("/bye")
    public String bye(){
        return "bye GitHub";
    }
}
