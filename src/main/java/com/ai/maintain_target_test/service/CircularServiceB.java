package com.ai.maintain_target_test.service;

import org.springframework.stereotype.Service;

@Service
public class CircularServiceB {

    private final CircularServiceA circularServiceA;

    public CircularServiceB(CircularServiceA circularServiceA) {
        this.circularServiceA = circularServiceA;
    }

    public String performAction() {
        return "Service B calling Service A: " + circularServiceA.performAction();
    }
}
