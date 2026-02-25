package com.example.hostelAllotment.service.impl;

import com.example.hostelAllotment.model.dto.ReportDto;
import com.example.hostelAllotment.model.entity.ReportEntity;
import com.example.hostelAllotment.repository.ReportRepository;
import com.example.hostelAllotment.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportRepository reportRepository;

    @Override
    public List<ReportDto> getReports() {
        List<ReportDto> reportDtos = new ArrayList<>();
        List<ReportEntity> reportEntities = reportRepository.findAll();

        for(int i = 0; i < reportEntities.size(); i++) {
            ReportDto dto = new ReportDto();
            ReportEntity reportEntity = reportEntities.get(i);

            dto.setReportId(reportEntity.getReportId());
            dto.setGeneratedBy(reportEntity.getGeneratedBy().getUserId());
            dto.setReportType(reportEntity.getReportType());
            dto.setGenerationDate(reportEntity.getGenerationDate());
            dto.setReportData(reportEntity.getReportData());
            dto.setFilePath(reportEntity.getFilePath());

            reportDtos.add(dto);
        }
        return reportDtos;
    }

    @Override
    public void createReport(ReportDto reportDto) {
        ReportEntity reportEntity = new ReportEntity();
        // Would need to set generatedBy by fetching from repository
        reportRepository.save(reportEntity);
    }

//    @Override
//    public void updateReport(Integer id, String filePath) {
//        ReportEntity entity = reportRepository.findById(id).get();
//        entity.setFilePath(filePath);
//        reportRepository.save(entity);
//    }

    @Override
    public void deleteReport(Integer id) {
        reportRepository.deleteById(id);
    }
}
