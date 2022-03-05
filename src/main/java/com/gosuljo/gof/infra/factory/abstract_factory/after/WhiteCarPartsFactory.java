package com.gosuljo.gof.infra.factory.abstract_factory.after;

import com.gosuljo.gof.infra.factory.abstract_factory.before.Handle;
import com.gosuljo.gof.infra.factory.abstract_factory.before.Wheel;
import com.gosuljo.gof.infra.factory.abstract_factory.before.WhiteHandle;
import com.gosuljo.gof.infra.factory.abstract_factory.before.WhiteWheel;

public class WhiteCarPartsFactory implements CarPartsFactory {
    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }

    @Override
    public Handle createHandle() {
        return new WhiteHandle();
    }
}
