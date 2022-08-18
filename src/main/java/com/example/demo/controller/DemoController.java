package com.example.demo.controller;

import com.example.demo.model.DemoModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class DemoController {
    @GetMapping("/hello")
    public DemoModel getHello() {
        DemoModel dm = new DemoModel();
        dm.setMessage("Hello World");
        return dm;
    }
}
