package com.hjservice.ma.payload;

import lombok.Data;

@Data
public class LoginRequest {

    private String email;
    private String password;

    // Getters and Setters (Omitted for brevity)
}