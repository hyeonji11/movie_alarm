package com.hjservice.ma.payload;

import lombok.Data;

@Data
public class SignUpRequest {

    private String name;

    private String email;

    private String password;

    // Getters and Setters (Omitted for brevity)
}