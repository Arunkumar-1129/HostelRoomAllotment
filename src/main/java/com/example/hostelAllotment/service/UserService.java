package com.example.hostelAllotment.service;

import com.example.hostelAllotment.model.dto.UserDto;

import java.util.List;

public interface UserService {
        List<UserDto> getUsers();
        void createUser(UserDto userDto);
//        void updateUser(Integer id, String name);
        void deleteUser(Integer id);
    }


