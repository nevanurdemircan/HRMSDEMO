package com.hrms.controller;

import com.hrms.entities.User;
import com.hrms.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api-user")
public class UserController {
    private final UserService userService;

    @GetMapping("fetch-all")
    public List<User> allUser() {
        return this.userService.findAll();
    }

    @GetMapping("fetch-one")
    public User fetchOne(@RequestParam Long id) {
        return this.userService.findOne(id);
    }

    @PostMapping("save")
    public User save(@RequestBody User user) {
        return this.userService.save(user);
    }

    @PutMapping("update")
    public User update(@RequestBody User user) {
        return this.userService.update(user);
    }

    @DeleteMapping("delete")
    public ResponseEntity delete(@RequestBody User user) {
        this.userService.delete(user);

        return new ResponseEntity(HttpStatus.OK);
    }

}
