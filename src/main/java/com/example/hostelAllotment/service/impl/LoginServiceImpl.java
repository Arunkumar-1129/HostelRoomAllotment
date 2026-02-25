package com.example.hostelAllotment.service.impl;

import com.example.hostelAllotment.model.dto.UserDto;
import com.example.hostelAllotment.model.entity.UserEntity;
import com.example.hostelAllotment.repository.UserRepository;
import com.example.hostelAllotment.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto login(String email, String password) {
        UserEntity userEntity = userRepository.findAll().stream()
                .filter(user -> user.getEmail().equals(email) && user.getPassword().equals(password))
                .findFirst().get();
        UserDto dto = new UserDto();
        dto.setUserId(userEntity.getUserId());
        dto.setName(userEntity.getName());
        dto.setEmail(userEntity.getEmail());
        dto.setPassword(userEntity.getPassword());
        dto.setRole(userEntity.getRole());
        dto.setPhone(userEntity.getPhone());
        dto.setCreatedDate(userEntity.getCreatedDate());

        return dto;
    }
    @Override
    public void register(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userDto.getName());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setPassword(userDto.getPassword());
        userEntity.setRole(userDto.getRole());
        userEntity.setPhone(userDto.getPhone());
        userEntity.setCreatedDate(userDto.getCreatedDate());
        userRepository.save(userEntity);
    }
}
