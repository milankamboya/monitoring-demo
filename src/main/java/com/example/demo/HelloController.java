package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping({"/", "/hello"})
    public String hello() {
        return "hello";
    }

    @GetMapping("/test")
    public String demo() {
        return "test";
    }

    @GetMapping("/welcome/{username}")
    public String demo(@PathVariable("username") String username) {
        return "welcome : " + username;
    }
}
