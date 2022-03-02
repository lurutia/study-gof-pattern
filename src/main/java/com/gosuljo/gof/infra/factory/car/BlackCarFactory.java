package com.gosuljo.gof.infra.factory.car;

public class BlackCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new BlackCar();
    }
}
