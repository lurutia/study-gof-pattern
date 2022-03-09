package com.gosuljo.gof.bridge;

import com.gosuljo.gof.infra.bridge.before.Champion;
import com.gosuljo.gof.infra.bridge.before.KDA아리;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BridgeTests {

    // 하나의 계층구조로 구현하기
    @Test
    public void bridge_test_1() {
        Champion kda아리 = new KDA아리();
        kda아리.skillQ();
        kda아리.skillR();
    }
}
