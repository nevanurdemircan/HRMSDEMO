package com.hrms.controller;

import com.hrms.dto.SignUpDto;
import com.hrms.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("register")
@RequiredArgsConstructor
public class RegisterController {
    private final RegisterService registerService;

    @PostMapping("sign-up")
    public String signUp(@RequestBody SignUpDto signUpDto){
      return   registerService.signUp(signUpDto);

    }
}
