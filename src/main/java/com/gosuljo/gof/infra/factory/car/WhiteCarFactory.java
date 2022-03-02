package com.gosuljo.gof.infra.factory.car;

public class WhiteCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new WhiteCar();
    }
}
