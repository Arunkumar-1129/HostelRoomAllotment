package com.example.hostelAllotment.service.impl;

import com.example.hostelAllotment.model.dto.AllotmentDto;
import com.example.hostelAllotment.model.entity.AllotmentEntity;
import com.example.hostelAllotment.repository.AllotmentRepository;
import com.example.hostelAllotment.service.RoomAllotmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RoomAllotmentServiceImpl implements RoomAllotmentService {
    @Autowired
    private AllotmentRepository allotmentRepository;

    @Override
    public List<AllotmentDto> getAllotments() {
        List<AllotmentDto> allotmentDtos = new ArrayList<>();
        List<AllotmentEntity> allotmentEntities = allotmentRepository.findAll();

        for(int i = 0; i < allotmentEntities.size(); i++) {
            AllotmentDto dto = new AllotmentDto();
            AllotmentEntity allotmentEntity = allotmentEntities.get(i);

            dto.setAllotmentId(allotmentEntity.getAllotmentId());
            dto.setUserId(allotmentEntity.getUserEntity().getUserId());
            dto.setRoomId(allotmentEntity.getRoomEntity().getRoomId());
            dto.setAllotmentDate(allotmentEntity.getAllotmentDate());
            dto.setCheckInDate(allotmentEntity.getCheckInDate());
            dto.setCheckOutDate(allotmentEntity.getCheckOutDate());
            dto.setStatus(allotmentEntity.getStatus());

            allotmentDtos.add(dto);
        }
        return allotmentDtos;
    }

    @Override
    public void createAllotment(AllotmentDto allotmentDto) {
        // Implementation would need userEntity and roomEntity objects
        // For now, basic structure
        AllotmentEntity allotmentEntity = new AllotmentEntity();
        // Would need to set userEntity and roomEntity by fetching from repositories
        allotmentRepository.save(allotmentEntity);
    }

//    @Override
//    public void updateAllotment(Integer id, String status) {
//        AllotmentEntity entity = allotmentRepository.findById(id).get();
//        entity.setStatus(status);
//        allotmentRepository.save(entity);
//    }

    @Override
    public void deleteAllotment(Integer id) {
        allotmentRepository.deleteById(id);
    }
}
