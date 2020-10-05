package com.bakir.ali.library_project.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class SignUpRequest {
    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;


    public String getEmail() {
        return null;
    }

    public Object getName() {
        return null;
    }

    public Object getPassword() {
        return null;
    }

}