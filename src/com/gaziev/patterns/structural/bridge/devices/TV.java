package com.gaziev.patterns.structural.bridge.devices;

public class TV implements Device {
    @Override
    public String on() {
        return "TV is on.";
    }

    @Override
    public String off() {
        return "TV is off.";
    }

    @Override
    public String change() {
        return "next channel.";
    }
}
