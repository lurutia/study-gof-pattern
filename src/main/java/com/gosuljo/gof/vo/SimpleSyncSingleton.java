package com.gosuljo.gof.vo;

public class SimpleSyncSingleton {
    private static SimpleSyncSingleton instance;
    public static synchronized SimpleSyncSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSyncSingleton();
        }

        return instance;
    }
}
