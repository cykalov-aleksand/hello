package com.example.helo.controller;

import com.example.helo.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloController {
    private final HelloService helloService;

    public HeloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello(){
        return helloService.hello();
    }
}
