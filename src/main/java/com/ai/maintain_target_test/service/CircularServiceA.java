package com.ai.maintain_target_test.service;

import org.springframework.stereotype.Service;

@Service
public class CircularServiceA {

    private final CircularServiceB circularServiceB;

    public CircularServiceA(CircularServiceB circularServiceB) {
        this.circularServiceB = circularServiceB;
    }

    public String performAction() {
        return "Service A calling Service B: " + circularServiceB.performAction();
    }
}
