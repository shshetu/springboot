package com.shetu.tacocloudchapter2.model;

import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class Order {
    //fields: name,street,city,state,zip,ccNumber,ccExpiration,ccCVV
    @NotBlank(message = "Name must not be blank")
    private String name;
    @NotBlank(message = "street must not be blank")
    private String street;
    @NotBlank(message = "city must not be blank")
    private String city;
    @NotBlank(message = "state must not be blank")
    private String state;
    @NotBlank(message = "zip must not be blank")
    private String zip;
    @CreditCardNumber(message = "Not a valid Credit card number")
    private String ccNumber;
    @Pattern(regexp = "^(0[1-9]|1[0-2])(\\/)([1-9][0-9])$", message = "Must be formatted MM/YY")
    private String ccExpiration;
    @Digits(integer = 3,fraction = 0,message = "Invalid CVV")
    private String ccCVV;

}
