package com.shetu.springbootjwtex.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class User {
    //fields: id, firstName, lastName, userName, password, salary, age

    private Integer id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private Integer salary;
    private Integer age;
}
