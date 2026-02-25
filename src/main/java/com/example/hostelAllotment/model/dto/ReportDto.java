package com.example.hostelAllotment.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReportDto {
    private Integer reportId;
    private Integer generatedBy;
    private String reportType;
    private Date generationDate;
    private String reportData;
    private String filePath;
}
