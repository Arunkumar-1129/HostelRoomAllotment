package com.example.hostelAllotment.controller;

import com.example.hostelAllotment.model.dto.ReportDto;
import com.example.hostelAllotment.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping("/allreports")
    public List<ReportDto> getAllReports() {
        return reportService.getReports();
    }

    @PutMapping("/createReport")
    public ResponseEntity<Object> createReport(@RequestBody ReportDto reportDto) {
        reportService.createReport(reportDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

//    @PostMapping("/updateReport/{id}/{filePath}")
//    public ResponseEntity<Object> updateReport(@PathVariable Integer id, @PathVariable String filePath) {
//        reportService.updateReport(id, filePath);
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//    }

    @DeleteMapping("/deleteReport/{id}")
    public ResponseEntity<Object> deleteReport(@PathVariable Integer id) {
        reportService.deleteReport(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
