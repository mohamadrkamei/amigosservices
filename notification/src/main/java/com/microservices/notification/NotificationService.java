package com.microservices.notification;

import com.amigoscode.clients.notification.NotificationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public void saveNotification(NotificationRequest request) {

        Notification notification = Notification.builder()
                .toCustomerId(request.customerId())
                .toCustomerEmail(request.toCustomerName())
                .message(request.message())
                .sender("not")
                .sentAt(LocalDateTime.now()).build();
        notificationRepository.save(notification);
    }
}
