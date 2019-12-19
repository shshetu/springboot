package com.shetu.docker.dockerspringboot.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker")
public class HelloResource{

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
