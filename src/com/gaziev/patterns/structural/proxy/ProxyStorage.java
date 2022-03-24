package com.gaziev.patterns.structural.proxy;

public class ProxyStorage {
    Storage localStorage;
    Storage remoteStorage;

    public ProxyStorage(Storage localStorage, Storage remoteStorage) {
        this.localStorage = localStorage;
        this.remoteStorage = remoteStorage;
    }

    public String getData() {
        if (localStorage.getData() == null) {
            return remoteStorage.getData();
        } else {
            return localStorage.getData();
        }
    }
}
