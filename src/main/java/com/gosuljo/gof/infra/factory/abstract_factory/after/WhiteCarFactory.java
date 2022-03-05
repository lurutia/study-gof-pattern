package com.gosuljo.gof.infra.factory.abstract_factory.after;

import com.gosuljo.gof.infra.factory.car.Car;
import com.gosuljo.gof.infra.factory.car.CarFactory;
import com.gosuljo.gof.infra.factory.car.WhiteCar;

public class WhiteCarFactory implements CarFactory {
    CarPartsFactory carPartsFactory;

    public WhiteCarFactory(CarPartsFactory carPartsFactory) {
        this.carPartsFactory = carPartsFactory;
    }

    @Override
    public Car createCar() {
        Car car = new WhiteCar();
        car.setHandle(carPartsFactory.createHandle());
        car.setWheel(carPartsFactory.createWheel());

        return car;
    }
}
