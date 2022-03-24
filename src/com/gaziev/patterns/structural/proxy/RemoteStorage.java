package com.gaziev.patterns.structural.proxy;

public class RemoteStorage implements Storage {
    @Override
    public String getData() {
        return "RemoteStorage: { data = \"from server.\" }";
    }
}
