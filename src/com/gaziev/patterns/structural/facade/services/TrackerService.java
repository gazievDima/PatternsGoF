package com.gaziev.patterns.structural.facade.services;

public class TrackerService {

    public String sendInfoApp(String info) {
        if (sendSuccess()) {
            return "send data success.";
        } else {
            return "send data fail.";
        }
    }

    private boolean sendSuccess() {
        return true;
    }
}
