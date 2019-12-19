package com.shetu.springbootjwtex.model;

public class Constants {
    //static fields: validity_seconds, signing_key,token_prefix,header_string
    public static final long ACCESS_TOKEN_VALIDITY_SECONDS = 5*60*60;
    public static final String SIGNING_KEY = "shetu1234";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}
