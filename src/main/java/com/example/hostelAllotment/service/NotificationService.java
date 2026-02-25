package com.example.hostelAllotment.service;

import com.example.hostelAllotment.model.dto.NotificationDto;

import java.util.List;

public interface NotificationService {
    List<NotificationDto> getNotifications();
    void createNotification(NotificationDto notificationDto);
//    void updateNotification(Integer id, Boolean isRead);
    void deleteNotification(Integer id);
}
