package com.example.hostelAllotment.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "rooms")
@Getter
@Setter
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Integer roomId;

    @Column(name = "room_number")
    private String roomNumber;

    @Column(name = "floor")
    private Integer floor;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "current_occupancy")
    private Integer currentOccupancy;

    @Column(name = "room_type")
    private String roomType;

    @Column(name = "amenities")
    private String amenities;

    @Column(name = "status")
    private String status;

    @Column(name = "price_per_month")
    private Double pricePerMonth;
}
