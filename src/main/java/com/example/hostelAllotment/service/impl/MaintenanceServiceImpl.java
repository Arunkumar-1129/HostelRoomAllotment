package com.example.hostelAllotment.service.impl;

import com.example.hostelAllotment.model.dto.MaintenanceDto;
import com.example.hostelAllotment.model.entity.MaintenanceEntity;
import com.example.hostelAllotment.repository.MaintenanceRepository;
import com.example.hostelAllotment.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MaintenanceServiceImpl implements MaintenanceService {
    @Autowired
    private MaintenanceRepository maintenanceRepository;

    @Override
    public List<MaintenanceDto> getMaintenances() {
        List<MaintenanceDto> maintenanceDtos = new ArrayList<>();
        List<MaintenanceEntity> maintenanceEntities = maintenanceRepository.findAll();

        for(int i = 0; i < maintenanceEntities.size(); i++) {
            MaintenanceDto dto = new MaintenanceDto();
            MaintenanceEntity maintenanceEntity = maintenanceEntities.get(i);

            dto.setMaintenanceId(maintenanceEntity.getMaintenanceId());
            dto.setRoomId(maintenanceEntity.getRoomEntity().getRoomId());
            dto.setReportedBy(maintenanceEntity.getReportedBy().getUserId());
            if(maintenanceEntity.getAssignedTo() != null) {
                dto.setAssignedTo(maintenanceEntity.getAssignedTo().getUserId());
            }
            dto.setIssueDescription(maintenanceEntity.getIssueDescription());
            dto.setPriority(maintenanceEntity.getPriority());
            dto.setStatus(maintenanceEntity.getStatus());
            dto.setReportedDate(maintenanceEntity.getReportedDate());
            dto.setCompletedDate(maintenanceEntity.getCompletedDate());
            dto.setMaintenanceCost(maintenanceEntity.getMaintenanceCost());

            maintenanceDtos.add(dto);
        }
        return maintenanceDtos;
    }

    @Override
    public void createMaintenance(MaintenanceDto maintenanceDto) {
        MaintenanceEntity maintenanceEntity = new MaintenanceEntity();

        maintenanceRepository.save(maintenanceEntity);
    }

//    @Override
//    public void updateMaintenance(Integer id, String status) {
//        MaintenanceEntity entity = maintenanceRepository.findById(id).get();
//        entity.setStatus(status);
//        maintenanceRepository.save(entity);
//    }

    @Override
    public void deleteMaintenance(Integer id) {

        maintenanceRepository.deleteById(id);
    }
}
