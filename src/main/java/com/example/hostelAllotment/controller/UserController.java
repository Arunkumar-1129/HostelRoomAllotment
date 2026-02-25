package com.example.hostelAllotment.controller;

import com.example.hostelAllotment.model.dto.UserDto;
import com.example.hostelAllotment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/allusers")
    public List<UserDto> getAllUsers() {
        return userService.getUsers();
    }

    @PutMapping("/createUser")
    public ResponseEntity<Object> createUser(@RequestBody UserDto userDto) {
        userService.createUser(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

//    @PostMapping("/updateUser/{id}/{name}")
//    public ResponseEntity<Object> updateUser(@PathVariable Integer id, @PathVariable String name) {
//        userService.updateUser(id, name);
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
