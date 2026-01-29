package com.ai.maintain_target_test.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public String createUser(String username) {
        String result = "User created: " + username;
        notificationService.sendNotification(result);
        return result;
    }

    public String getServiceName() {
        return "UserService";
    }
}
