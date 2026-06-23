package com.pibmc.demo;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Controller {
    @GetMapping("Hello")
    public String sayHello() {
        return "Hello,World!";
    } 
}
