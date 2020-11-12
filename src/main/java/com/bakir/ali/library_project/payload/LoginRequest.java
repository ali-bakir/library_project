package com.bakir.ali.library_project.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class LoginRequest {
    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;

    public Object getEmail() {
        return email;
    }

    public Object getPassword() {
        return null;
    }
}