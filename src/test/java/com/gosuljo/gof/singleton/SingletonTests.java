package com.gosuljo.gof.singleton;

import com.gosuljo.gof.vo.NoneSingletonVO;
import com.gosuljo.gof.vo.SimpleSingleton;
import com.gosuljo.gof.vo.SimpleSyncSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ThreadPoolExecutor;

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

    // 생성자가 쓰레드 세이프한 싱글톤
    @Test
    public void singleton_test_3() {
        SimpleSyncSingleton singleton1 = SimpleSyncSingleton.getInstance();
        SimpleSyncSingleton singleton2 = SimpleSyncSingleton.getInstance();

        Assertions.assertEquals(singleton1, singleton2);
    }

}
