package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Member;


@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "Joe") String name) {
        return String.format("Hello %s!", name);
    }

    @PostMapping(path = "/update", consumes = "application/json", produces = "application/json")
    public void addMember(@RequestBody Member member) {
        //code
    }
}
