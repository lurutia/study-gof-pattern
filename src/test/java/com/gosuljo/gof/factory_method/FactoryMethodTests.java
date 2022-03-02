package com.gosuljo.gof.factory_method;

import com.gosuljo.gof.infra.factory.car.BlackCarFactory;
import com.gosuljo.gof.infra.factory.car.Car;
import com.gosuljo.gof.infra.factory.car.CarFactory;
import com.gosuljo.gof.infra.factory.car.WhiteCarFactory;
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

	// default factory method test
	@Test
	public void factory_method_test_2() {
		Car whiteCar = new WhiteCarFactory().orderCar("whiteCar", "car@email.com");
		System.out.println(whiteCar);
		Assertions.assertEquals(whiteCar.getName(), "whiteCar");
		Assertions.assertEquals(whiteCar.getLogo(), "\uD83D\uDEE5");
		Assertions.assertEquals(whiteCar.getColor(), "white");

		Car blackCar = new BlackCarFactory().orderCar("blackCar", "car@mail.com");
		Assertions.assertEquals(blackCar.getName(), "blackCar");
		Assertions.assertEquals(blackCar.getLogo(), "T");
		Assertions.assertEquals(blackCar.getColor(), "black");
		System.out.println(blackCar);
	}

	// client factory method test
	@Test
	public void factory_method_test_3() {
		Car whiteCar = generateCarClient(new WhiteCarFactory(), "whiteCar", "car@mail.com");
		System.out.println(whiteCar);
		Assertions.assertEquals(whiteCar.getName(), "whiteCar");
		Assertions.assertEquals(whiteCar.getLogo(), "\uD83D\uDEE5");
		Assertions.assertEquals(whiteCar.getColor(), "white");

		Car blackCar = generateCarClient(new BlackCarFactory(), "blackCar", "car@mail.com");
		Assertions.assertEquals(blackCar.getName(), "blackCar");
		Assertions.assertEquals(blackCar.getLogo(), "T");
		Assertions.assertEquals(blackCar.getColor(), "black");
		System.out.println(blackCar);
	}

	private Car generateCarClient(CarFactory factory, String name, String email) {
		return factory.orderCar(name, email);
	}
}
