package com.example.hostelAllotment.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MaintenanceDto {

    private Integer maintenanceId;
    private Integer roomId;
    private Integer reportedBy;
    private Integer assignedTo;
    private String issueDescription;
    private String priority;
    private String status;
    private Date reportedDate;
    private Date completedDate;
    private Double maintenanceCost;
}
