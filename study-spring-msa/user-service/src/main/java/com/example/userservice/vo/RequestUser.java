package com.example.userservice.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestUser {
    @NotNull(message = "email should not be null")
    @Size(min = 2, message = "Email not be less than two characters")
    @Email
    private String email;

    @NotNull(message = "name must not be null")
    private String name;

    @NotNull(message = "password must not be null")
    @Size(min = 8, message = "Password must greater than 8 characters")
    private String password;
}
