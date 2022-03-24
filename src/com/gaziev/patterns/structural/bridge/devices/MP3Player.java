package com.gaziev.patterns.structural.bridge.devices;

public class MP3Player implements Device {
    @Override
    public String on() {
        return "MP3Player is on.";
    }

    @Override
    public String off() {
        return "MP3Player is off.";
    }

    @Override
    public String change() {
        return "next track.";
    }

}
