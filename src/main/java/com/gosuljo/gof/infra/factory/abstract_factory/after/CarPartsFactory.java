package com.gosuljo.gof.infra.factory.abstract_factory.after;

import com.gosuljo.gof.infra.factory.abstract_factory.before.Handle;
import com.gosuljo.gof.infra.factory.abstract_factory.before.Wheel;

public interface CarPartsFactory {
    Wheel createWheel();
    Handle createHandle();
}
