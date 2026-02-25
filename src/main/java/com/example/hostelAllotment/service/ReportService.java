package com.example.hostelAllotment.service;

import com.example.hostelAllotment.model.dto.ReportDto;

import java.util.List;

public interface ReportService {
    List<ReportDto> getReports();
    void createReport(ReportDto reportDto);
//    void updateReport(Integer id, String filePath);
    void deleteReport(Integer id);
}
