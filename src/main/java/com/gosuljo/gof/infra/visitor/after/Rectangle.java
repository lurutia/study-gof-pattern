package com.gosuljo.gof.infra.visitor.after;

public class Rectangle implements Shape {
    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
