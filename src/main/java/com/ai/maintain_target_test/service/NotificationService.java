package com.ai.maintain_target_test.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendNotification(String message) {
        System.out.println("Notification sent: " + message);
    }

    public String getServiceName() {
        return "NotificationService";
    }
}
