package com.gosuljo.gof.infra.visitor.after;

public class Phone implements Device {
    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print Rectangle to Phone");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print Triangle to Phone");
    }
}
