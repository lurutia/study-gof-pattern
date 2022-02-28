package com.gosuljo.gof.vo;

public class StaticInnerSingleton {
    private StaticInnerSingleton() {};

    private static class StaticInnerSingletonHolder {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return StaticInnerSingletonHolder.INSTANCE;
    }
}
