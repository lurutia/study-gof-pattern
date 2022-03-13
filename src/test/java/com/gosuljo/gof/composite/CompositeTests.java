package com.gosuljo.gof.composite;

import com.gosuljo.gof.infra.composite.before.Bag;
import com.gosuljo.gof.infra.composite.before.Item;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CompositeTests {
    // composite 적용 전 테스트
    @Test
    public void composite_test_1() {
        Item doranBlade = new Item("도란검", 450);
        Item heathPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(heathPotion);

        printPrice(doranBlade);
        printPrice(bag);
    }

    private void printPrice(Item item) {
        System.out.println(item.getPrice());
    }

    private void printPrice(Bag bag) {
        System.out.println(bag.getItems().stream().mapToInt(Item::getPrice).sum());
    }
}
