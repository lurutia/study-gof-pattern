package com.gosuljo.gof.singleton;

import com.gosuljo.gof.vo.NoneSingletonVO;
import com.gosuljo.gof.vo.SimpleSingleton;
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

    // 가장 간단하게 구현한 싱글톤
    @Test
    public void singleton_test_2() {
        SimpleSingleton simpleSingleton1 = SimpleSingleton.getInstance();
        SimpleSingleton simpleSingleton2 = SimpleSingleton.getInstance();

        Assertions.assertEquals(simpleSingleton1, simpleSingleton2);
    }
}
