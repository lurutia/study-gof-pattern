package com.gosuljo.gof.factory_method;

import com.gosuljo.gof.infra.factory.abstract_factory.before.WhiteCarFactory;
import com.gosuljo.gof.infra.factory.abstract_factory.before.WhiteHandle;
import com.gosuljo.gof.infra.factory.abstract_factory.before.WhiteWheel;
import com.gosuljo.gof.infra.factory.car.Car;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AbstractFactoryMethodTests {

    // 추상 팩토리 메소드 테스트
    @Test
    public void abstract_factory_method_1() {
        Car whiteCar = new WhiteCarFactory().orderCar("whiteCar", "white@email.com");
        assertEquals(whiteCar.getName(), "whiteCar");
        assertEquals(whiteCar.getLogo(), "\uD83D\uDEE5");
        assertEquals(whiteCar.getColor(), "white");
        assertThat(whiteCar.getHandle(), instanceOf(WhiteHandle.class));
        assertThat(whiteCar.getWheel(), instanceOf(WhiteWheel.class));
    }
}
