package com.example.hostelAllotment.service;

import com.example.hostelAllotment.model.dto.AllotmentDto;

import java.util.List;

public interface RoomAllotmentService {
    List<AllotmentDto> getAllotments();
    void createAllotment(AllotmentDto allotmentDto);
//    void updateAllotment(Integer id, String status);
    void deleteAllotment(Integer id);
}
