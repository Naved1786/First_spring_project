package com.firstapp.first_spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo/apis")
public class DemoController {
    @GetMapping("/demo1")
    public String demoApi1(){
        return "this is our first demo API";
    }

    @GetMapping("/demo2")
    public String demoApi2(){
        return "this is our second demo API";
    }
}
