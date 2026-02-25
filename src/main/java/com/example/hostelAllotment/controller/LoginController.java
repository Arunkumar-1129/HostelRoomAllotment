package com.example.hostelAllotment.controller;

import com.example.hostelAllotment.model.dto.UserDto;
import com.example.hostelAllotment.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    private LoginService authService;

    @PostMapping("/login/{email}/{password}")
    public ResponseEntity<Object> loginUser(@PathVariable String email, @PathVariable String password) {
        UserDto user = authService.login(email, password);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @PutMapping("/register")
    public ResponseEntity<Object> registerUser(@RequestBody UserDto userDto) {
        authService.register(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
