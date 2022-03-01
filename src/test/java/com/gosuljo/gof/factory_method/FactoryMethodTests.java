package com.gosuljo.gof.factory_method;

import com.gosuljo.gof.infra.factory.fish.Fish;
import com.gosuljo.gof.infra.factory.fish.FishFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FactoryMethodTests {

	// simple factory method test
	@Test
	public void factory_method_test_1() {
		Fish whiteFish = FishFactory.orderFish("whiteFish", "fish@mail.com");
		System.out.println(whiteFish);
		Assertions.assertEquals(whiteFish.getName(), "whiteFish");
		Assertions.assertEquals(whiteFish.getLogo(), "\uD83D\uDEE5");
		Assertions.assertEquals(whiteFish.getColor(), "white");

		Fish blackFish = FishFactory.orderFish("blackFish", "fish@mail.com");
		Assertions.assertEquals(blackFish.getName(), "blackFish");
		Assertions.assertEquals(blackFish.getLogo(), "T");
		Assertions.assertEquals(blackFish.getColor(), "black");
		System.out.println(blackFish);
	}
}
