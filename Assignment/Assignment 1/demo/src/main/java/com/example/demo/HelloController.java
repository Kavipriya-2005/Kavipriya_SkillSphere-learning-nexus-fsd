package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Postman!";
    }

    @PostMapping("/welcome")
public String welcome(@RequestBody User user) {
    return "Welcome " + user.getName();
}
}