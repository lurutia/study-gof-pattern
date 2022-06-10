package com.gosuljo.gof.infra.visitor.after;

public class Watch implements Device {
    @Override
    public void print(Rectangle rectangle) {
        System.out.println("print Rectangle to Watch");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("print Triangle to Watch");
    }
}
