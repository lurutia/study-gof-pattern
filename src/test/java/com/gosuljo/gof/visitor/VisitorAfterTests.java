package com.gosuljo.gof.visitor;

import com.gosuljo.gof.infra.visitor.after.Device;
import com.gosuljo.gof.infra.visitor.after.Phone;
import com.gosuljo.gof.infra.visitor.after.Rectangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VisitorAfterTests {
    @Test
    public void visitor_test_1() {
        Rectangle rectangle = new Rectangle();
        Device device = new Phone();
        // 컴파일 시 에러 발생 JAVA는 더블 디스패치를 지원하지 않음.
//        rectangle.printTo(device);
    }

    @Test
    public void visitor_test_2() {
        Rectangle rectangle = new Rectangle();
        Device device = new Phone();
        rectangle.accept(device);
    }
}
