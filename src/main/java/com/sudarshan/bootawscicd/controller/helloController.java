package com.sudarshan.bootawscicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    
    @GetMapping(value= "/")
    public String sayHello() {
        return "Hello World";
    }
}
