package com.gosuljo.gof.infra.factory.abstract_factory.before;

import com.gosuljo.gof.infra.factory.car.Car;
import com.gosuljo.gof.infra.factory.car.CarFactory;
import com.gosuljo.gof.infra.factory.car.WhiteCar;

public class WhiteCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        Car car = new WhiteCar();
        car.setHandle(new WhiteHandle());
        car.setWheel(new WhiteWheel());
        return car;
    }
}
