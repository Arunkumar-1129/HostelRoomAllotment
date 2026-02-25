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
public class NotificationDto {
    private Integer notificationId;
    private Integer userId;
    private String title;
    private String message;
    private String type;
    private Boolean isRead;
    private Date createdDate;
    private Date expiryDate;
}
