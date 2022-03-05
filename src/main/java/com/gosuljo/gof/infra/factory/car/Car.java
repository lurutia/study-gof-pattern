package com.gosuljo.gof.infra.factory.car;

import com.gosuljo.gof.infra.factory.abstract_factory.before.Handle;
import com.gosuljo.gof.infra.factory.abstract_factory.before.Wheel;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Car {
    private String name;
    private String color;
    private String logo;
    private Handle handle;
    private Wheel wheel;
}
