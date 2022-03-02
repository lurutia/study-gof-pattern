package com.gosuljo.gof.infra.factory.car;


public interface CarFactory {
    default Car orderCar(String name, String email) {
        validation(name, email);
        prepareFor(name);
        Car car = createCar();
        sendEmailTo(email, car);
        return car;
    }

    Car createCar();

    private static void validation(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("차 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    private static void sendEmailTo(String email, Car car) {
        System.out.println(car.getName() + " 다 만들었습니다.");
    }
}
