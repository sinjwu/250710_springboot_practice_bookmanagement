package com.practice._250710_springboot_practice_bookmanagement.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class HelloController {
    @GetMapping
    public String sayHello() {
        return "hello";
    }
    @PostMapping
    public String sayPostHello() {
        return "post hello";
    }
    @PutMapping
    public String sayPutHello() {
        return "put hello";
    }
    @DeleteMapping
    public String sayDeleteHello() {
        return "delete hello";
    }
}
