package com.shetu.springbootfirstexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

//login => "Hello World"
    @GetMapping({"/login","/"})
    public String sayHello(){
        return "my-login";
    }

    // /go => "Hello My World of Spring"
    @RequestMapping("/go")
    @ResponseBody
    public List<String> sayGo(){
        List<String> stringList = new ArrayList<>();
        stringList.add("Shetu");
        stringList.add("Nodi");
        stringList.add("Shanto");
        return stringList;
    }
}
