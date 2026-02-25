package com.example.hostelAllotment.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "reports")
@Getter
@Setter
public class ReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "report_id")
    private Integer reportId;

    @ManyToOne
    @JoinColumn(name = "generated_by")
    private UserEntity generatedBy;

    @Column(name = "report_type")
    private String reportType;

    @Column(name = "generation_date")
    private Date generationDate;

    @Column(name = "report_data")
    private String reportData;

    @Column(name = "file_path")
    private String filePath;
}
