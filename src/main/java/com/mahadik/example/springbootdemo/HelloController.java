package com.mahadik.example.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return String.format("Hello %s, Welcome to the Spring Boot", name);
    }

    @GetMapping(value = "/error1")
    public String error() {
        return "ERROR PAGE";
    }
}
