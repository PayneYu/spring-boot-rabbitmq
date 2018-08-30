package com.payne.controller;

import com.payne.hello.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloSender helloSender;

    @GetMapping("/hello")
    public void send() {
        helloSender.send("Hello Payne!");
    }
}
