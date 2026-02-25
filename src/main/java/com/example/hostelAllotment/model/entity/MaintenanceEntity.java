package com.example.hostelAllotment.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;

@Entity
@Table(name = "maintenance")
@Getter
@Setter
public class MaintenanceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maintenance_id")
    private Integer maintenanceId;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private RoomEntity roomEntity;

    @ManyToOne
    @JoinColumn(name = "reported_by")
    private UserEntity reportedBy;

    @ManyToOne
    @JoinColumn(name = "assigned_to")
    private UserEntity assignedTo;

    @Column(name = "issue_description")
    private String issueDescription;

    @Column(name = "priority")
    private String priority;

    @Column(name = "status")
    private String status;

    @Column(name = "reported_date")
    private Date reportedDate;

    @Column(name = "completed_date")
    private Date completedDate;

    @Column(name = "maintenance_cost")
    private Double maintenanceCost;

}
