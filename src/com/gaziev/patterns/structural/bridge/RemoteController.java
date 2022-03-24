package com.gaziev.patterns.structural.bridge;

import com.gaziev.patterns.structural.bridge.devices.Device;

public class RemoteController {
    private final Device device;

    public RemoteController(Device device) {
        this.device = device;
    }

    public String onDevice() {
        return device.on();
    }

    public String offDevice() {
        return device.off();
    }

    public String changeChannel() {
        return device.change();
    }
}
