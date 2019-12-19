package com.shetu.springbootjwtex.controller;

import com.shetu.springbootjwtex.model.ApiResponse;
import com.shetu.springbootjwtex.model.User;
import com.shetu.springbootjwtex.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    //Global Variable
    private List<User> userList;
    //find List
    @GetMapping("/userList")
    public ApiResponse<List<User>> findUserList(){
        return new ApiResponse<>(HttpStatus.OK.value(),"User list fetched successfully.",userService.findUserList());
    }
    ///find User by id

    //add User

    //update User

    //delete User

}
