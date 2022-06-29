package com.hrms.service.impl;

import com.hrms.entities.User;
import com.hrms.repository.UserRepository;
import com.hrms.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public User save(User entity) {
       User user= this.userRepository.save(entity);
        return user;
    }

    @Override
    public void delete(User entity) {
        this.userRepository.delete(entity);
    }

    @Override
    public User update(User entity) {
        return this.userRepository.save(entity);
    }

    @Override
    public User findOne(Long aLong) {
       return this.userRepository.findById(aLong).get();

    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }
}
