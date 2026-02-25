package com.example.hostelAllotment.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoomDto {

    private Integer roomId;
    private String roomNumber;
    private Integer floor;
    private Integer capacity;
    private Integer currentOccupancy;
    private String roomType;
    private String amenities;
    private String status;
    private Double pricePerMonth;
}
