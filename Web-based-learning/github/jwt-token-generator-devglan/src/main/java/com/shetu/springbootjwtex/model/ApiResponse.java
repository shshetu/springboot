package com.shetu.springbootjwtex.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ApiResponse<T>  {
    //fields: status,message, result
    private int status;
    private String message;
    private Object result;
}
