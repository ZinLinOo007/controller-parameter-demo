package com.example.controllerparameterdemo.ds;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
public class Address {

    @NotBlank(message = "Street Name cannot be blank!")
    private String streetName;

    @NotBlank(message = "Zip Code cannot be blank!")
    private String zipCode;

    @NotBlank(message = "City cannot be blank!")
    private String city;



}
