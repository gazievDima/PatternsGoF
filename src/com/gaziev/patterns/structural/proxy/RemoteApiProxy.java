package com.gaziev.patterns.structural.proxy;

public class RemoteApiProxy implements Storage {

    RemoteApi remoteApi = new RemoteApi();

    @Override
    public String saveData() {
        if(remoteApi.save()) {
            return "Data success is saved.";
        } else {
            return "Data failed is saved.";
        }
    }

    @Override
    public String getData() {
        return "Remote Api info: " + remoteApi.get();
    }
}
