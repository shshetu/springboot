package com.shetu.springbootjwtex.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class LoginUser {
    //fields: username, password
    private String userName;
    private String password;
}
