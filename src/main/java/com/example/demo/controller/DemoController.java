package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello World!";
    }
    @GetMapping("/xandarstatus")
    public String getXandarStatus() {
        return "Xandar Sensor is functioning well";
    }
}
