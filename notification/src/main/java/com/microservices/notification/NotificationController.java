package com.microservices.notification;

import com.amigoscode.clients.notification.NotificationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/notification")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

   @PostMapping(path = "send")
    public void sendNotification(@RequestBody NotificationRequest notificationRequest){
       log.info("create notification {}" , notificationRequest);
       notificationService.saveNotification(notificationRequest);
   }
}
