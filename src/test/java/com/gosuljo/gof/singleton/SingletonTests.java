package com.gosuljo.gof.singleton;

import com.gosuljo.gof.vo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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

    // 이른 초기화 생성 쓰레드 세이프한 싱글톤
    @Test
    public void singleton_test_4() {
        EarlyMakeSingleton singleton1 = EarlyMakeSingleton.getInstance();
        EarlyMakeSingleton singleton2 = EarlyMakeSingleton.getInstance();

        Assertions.assertEquals(singleton1, singleton2);
    }

    // double check locking 방법을 사용한 스레드 세이프 싱글톤
    @Test
    public void singleton_test_5() {
        DCLSingleton singleton1 = DCLSingleton.getInstance();
        DCLSingleton singleton2 = DCLSingleton.getInstance();

        Assertions.assertEquals(singleton1, singleton2);
    }

    // static inner 사용 singleton
    @Test
    public void singleton_test_6() {
        StaticInnerSingleton singleton1 = StaticInnerSingleton.getInstance();
        StaticInnerSingleton singleton2 = StaticInnerSingleton.getInstance();

        Assertions.assertEquals(singleton1, singleton2);
    }

    // static inner singleton 깨트리기
    @Test
    public void singleton_test_7() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        StaticInnerSingleton singleton1 = StaticInnerSingleton.getInstance();

        Constructor<StaticInnerSingleton> constructor = StaticInnerSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        StaticInnerSingleton singleton2 = constructor.newInstance();

        Assertions.assertNotEquals(singleton1, singleton2);
    }
}
