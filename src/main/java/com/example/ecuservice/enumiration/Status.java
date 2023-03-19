package com.example.ecuservice.enumiration;

public enum Status {

    DEVICE_CONNECT("DEVICE_CONNECT"),
    DEVICE_NOT_CONNECT("DEVICE_NOT_CONNECT");

    private String device;

    Status(String device) {
        this.device = device;
    }

    public String getDevice() {
        return device;
    }
}
