package com.example.userservice.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestLogin {
    @NotNull(message = "email cannot be null")
    @Size(min = 2, message= "email grater than 2 characters")
    private String email;

    @NotNull(message = "password cannot be null")
    @Size(min = 8, message= "password grater than 8 characters")
    private String password;
}
