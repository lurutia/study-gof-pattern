package com.gosuljo.gof.strategy;

import com.gosuljo.gof.infra.strategy.after.BlueLightRedLight;
import com.gosuljo.gof.infra.strategy.after.FastSpeed;
import com.gosuljo.gof.infra.strategy.after.NormalSpeed;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StrategyAfterTests {
    @Test
    public void strategy_test_1() {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new NormalSpeed());
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();
    }

    @Test
    public void strategy_test_2() {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new FastSpeed());
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();
    }
}
