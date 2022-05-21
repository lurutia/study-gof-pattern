package com.gosuljo.gof.visitor;

import com.gosuljo.gof.infra.visitor.before.Phone;
import com.gosuljo.gof.infra.visitor.before.Rectangle;
import com.gosuljo.gof.infra.visitor.before.Shape;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VisitorBeforeTests {
    @Test
    public void visitor_test_1() {
        Shape rectangle = new Rectangle();
        rectangle.printTo(new Phone());
    }
}
