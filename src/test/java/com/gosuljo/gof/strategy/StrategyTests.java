package com.gosuljo.gof.strategy;

import com.gosuljo.gof.infra.strategy.before.BlueLightRedLight;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StrategyTests {
    @Test
    public void strategy_test_1() {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(1);
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();
    }

    @Test
    public void strategy_test_2() {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(2);
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();
    }

    @Test
    public void strategy_test_3() {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(3);
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();
    }
}
