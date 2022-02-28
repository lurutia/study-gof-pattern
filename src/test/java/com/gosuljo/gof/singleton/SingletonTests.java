package com.gosuljo.gof.singleton;

import com.gosuljo.gof.vo.NoneSingletonVO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SingletonTests {

    // new로 생성된 object가 일치하지 않는지 테스트
    @Test
    public void singleton_test_1() {
        NoneSingletonVO temp1 = new NoneSingletonVO();
        NoneSingletonVO temp2 = new NoneSingletonVO();

        Assertions.assertNotEquals(temp1, temp2);
    }
}
