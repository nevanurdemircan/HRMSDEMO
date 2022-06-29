package com.hrms.service.impl;

import com.hrms.dto.SignUpDto;
import com.hrms.entities.User;
import com.hrms.repository.UserRepository;
import com.hrms.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterServiceImpl implements RegisterService {
    private final UserRepository userRepository;

    @Override
    public String signUp(SignUpDto signUpDto) {
        User user = new User();
        user.setEmail(signUpDto.getEmail());
        user.setIdentity(signUpDto.getIdentity());
        user.setName(signUpDto.getName());
        user.setPassword(signUpDto.getPassword());
        user.setLastName(signUpDto.getLastName());
        userRepository.save(user);

        return "Başarılı";
    }
}
