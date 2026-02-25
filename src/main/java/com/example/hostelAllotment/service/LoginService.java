package com.example.hostelAllotment.service;

import com.example.hostelAllotment.model.dto.UserDto;

public interface LoginService {
    UserDto login(String email, String password);
    void register(UserDto userDto);
}
