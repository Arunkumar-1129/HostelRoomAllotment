package com.example.hostelAllotment.controller;

import com.example.hostelAllotment.model.dto.NotificationDto;
import com.example.hostelAllotment.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @GetMapping("/allnotifications")
    public List<NotificationDto> getAllNotifications() {
        return notificationService.getNotifications();
    }

    @PutMapping("/createNotification")
    public ResponseEntity<Object> createNotification(@RequestBody NotificationDto notificationDto) {
        notificationService.createNotification(notificationDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

//    @PostMapping("/updateNotification/{id}/{isRead}")
//    public ResponseEntity<Object> updateNotification(@PathVariable Integer id, @PathVariable Boolean isRead) {
//        notificationService.updateNotification(id, isRead);
//        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//    }

    @DeleteMapping("/deleteNotification/{id}")
    public ResponseEntity<Object> deleteNotification(@PathVariable Integer id) {
        notificationService.deleteNotification(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
