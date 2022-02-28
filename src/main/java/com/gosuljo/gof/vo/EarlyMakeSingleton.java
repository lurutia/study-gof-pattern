package com.gosuljo.gof.vo;

public class EarlyMakeSingleton {
    private static final EarlyMakeSingleton INSTANCE = new EarlyMakeSingleton();
    public static EarlyMakeSingleton getInstance() {
        return INSTANCE;
    }
}
