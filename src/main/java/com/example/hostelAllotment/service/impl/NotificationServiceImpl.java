package com.example.hostelAllotment.service.impl;

import com.example.hostelAllotment.model.dto.NotificationDto;
import com.example.hostelAllotment.model.entity.NotificationEntity;
import com.example.hostelAllotment.repository.NotificationRepository;
import com.example.hostelAllotment.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class NotificationServiceImpl implements NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    @Override
    public List<NotificationDto> getNotifications() {
        List<NotificationDto> notificationDtos = new ArrayList<>();
        List<NotificationEntity> notificationEntities = notificationRepository.findAll();

        for(int i = 0; i < notificationEntities.size(); i++) {
            NotificationDto dto = new NotificationDto();
            NotificationEntity notificationEntity = notificationEntities.get(i);

            dto.setNotificationId(notificationEntity.getNotificationId());
            dto.setUserId(notificationEntity.getUserEntity().getUserId());
            dto.setTitle(notificationEntity.getTitle());
            dto.setMessage(notificationEntity.getMessage());
            dto.setType(notificationEntity.getType());
            dto.setIsRead(notificationEntity.getIsRead());
            dto.setCreatedDate(notificationEntity.getCreatedDate());
            dto.setExpiryDate(notificationEntity.getExpiryDate());

            notificationDtos.add(dto);
        }
        return notificationDtos;
    }

    @Override
    public void createNotification(NotificationDto notificationDto) {
        NotificationEntity notificationEntity = new NotificationEntity();
        // Would need to set userEntity by fetching from repository
        notificationRepository.save(notificationEntity);
    }

//    @Override
//    public void updateNotification(Integer id, Boolean isRead) {
//        NotificationEntity entity = notificationRepository.findById(id).get();
//        entity.setIsRead(isRead);
//        notificationRepository.save(entity);
//    }

    @Override
    public void deleteNotification(Integer id) {
        notificationRepository.deleteById(id);
    }
}
