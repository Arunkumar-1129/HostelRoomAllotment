package com.example.hostelAllotment.service;

import com.example.hostelAllotment.model.dto.MaintenanceDto;

import java.util.List;

public interface MaintenanceService {
    List<MaintenanceDto> getMaintenances();
    void createMaintenance(MaintenanceDto maintenanceDto);
//    void updateMaintenance(Integer id, String status);
    void deleteMaintenance(Integer id);
}
