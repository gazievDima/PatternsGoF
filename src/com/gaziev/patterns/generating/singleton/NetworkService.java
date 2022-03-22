package com.gaziev.patterns.generating.singleton;

public class NetworkService {

    private static NetworkService instance;
    private String cache = "empty";

    private NetworkService() {
    }

    public static NetworkService getInstance() {
        if (instance == null) {
            instance = new NetworkService();
            return instance;
        }
        return instance;
    }

    public String getCache() {
        return cache;
    }

    public void saveCache(String value) {
        cache = value;
    }
}
