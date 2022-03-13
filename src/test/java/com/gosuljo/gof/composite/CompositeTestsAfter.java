package com.gosuljo.gof.composite;

import com.gosuljo.gof.infra.composite.after.Bag;
import com.gosuljo.gof.infra.composite.after.Component;
import com.gosuljo.gof.infra.composite.after.Item;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CompositeTestsAfter {

    @Test
    public void composite_after_test_1() {
        Item doranBlade = new Item("도란검", 450);
        Item heathPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(heathPotion);

        printPrice(doranBlade);
        printPrice(bag);
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
