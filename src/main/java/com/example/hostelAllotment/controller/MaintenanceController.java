package com.example.hostelAllotment.controller;

import com.example.hostelAllotment.model.dto.MaintenanceDto;
import com.example.hostelAllotment.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MaintenanceController {
    @Autowired
    private MaintenanceService maintenanceService;

    @GetMapping("/allmaintenances")
    public List<MaintenanceDto> getAllMaintenances() {
        return maintenanceService.getMaintenances();
    }

    @PutMapping("/createMaintenance")
    public ResponseEntity<Object> createMaintenance(@RequestBody MaintenanceDto maintenanceDto) {
        maintenanceService.createMaintenance(maintenanceDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

//    @PostMapping("/updateMaintenance/{id}/{status}")
//    public ResponseEntity<Object> updateMaintenance(@PathVariable Integer id, @PathVariable String status) {
//        maintenanceService.updateMaintenance(id, status);
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//    }

    @DeleteMapping("/deleteMaintenance/{id}")
    public ResponseEntity<Object> deleteMaintenance(@PathVariable Integer id) {
        maintenanceService.deleteMaintenance(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
