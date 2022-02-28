package com.gosuljo.gof.vo;

public class SimpleSingleton {
    private static SimpleSingleton instance;
    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }

        return instance;
    }
}
