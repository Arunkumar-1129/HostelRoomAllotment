package com.example.hostelAllotment.service.impl;

import com.example.hostelAllotment.model.dto.UserDto;
import com.example.hostelAllotment.model.entity.UserEntity;
import com.example.hostelAllotment.repository.UserRepository;
import com.example.hostelAllotment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDto> getUsers() {
        List<UserDto> userDtos = new ArrayList<>();
        List<UserEntity> userEntities = userRepository.findAll();

        for(int i = 0; i < userEntities.size(); i++) {
            UserDto dto = new UserDto();
            UserEntity userEntity = userEntities.get(i);

            dto.setUserId(userEntity.getUserId());
            dto.setName(userEntity.getName());
            dto.setEmail(userEntity.getEmail());
            dto.setPassword(userEntity.getPassword());
            dto.setRole(userEntity.getRole());
            dto.setPhone(userEntity.getPhone());
            dto.setCreatedDate(userEntity.getCreatedDate());

            userDtos.add(dto);
        }
        return userDtos;
    }

    @Override
    public void createUser(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userDto.getName());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setPassword(userDto.getPassword());
        userEntity.setRole(userDto.getRole());
        userEntity.setPhone(userDto.getPhone());
        userEntity.setCreatedDate(userDto.getCreatedDate());

        userRepository.save(userEntity);
    }

//    @Override
//    public void updateUser(Integer id, String name) {
//        UserEntity entity = userRepository.findById(id).get();
//        entity.setName(name);
//        userRepository.save(entity);
//    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
