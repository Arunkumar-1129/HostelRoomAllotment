package com.example.hostelAllotment.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.sql.Date;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AllotmentDto {
    private Integer allotmentId;
    private Integer userId;
    private Integer roomId;
    private Date allotmentDate;
    private Date checkInDate;
    private Date checkOutDate;
    private String status;
}
