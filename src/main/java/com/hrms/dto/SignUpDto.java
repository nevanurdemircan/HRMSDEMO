package com.hrms.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignUpDto {
    private String name;
    private String lastName;
    private String identity;
    private String email;
    private String password;
    private String rePassword;
    private int userRole;
}
