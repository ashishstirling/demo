package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DemoControllerTests {
    @Autowired
    private DemoController demoController;
    @Test
    void testGetHello() {
       assertEquals("Hello World!", demoController.getHello());
    }
}
