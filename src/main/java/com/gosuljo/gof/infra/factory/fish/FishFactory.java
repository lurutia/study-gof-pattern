package com.gosuljo.gof.infra.factory.fish;

public class FishFactory {
	public static Fish orderFish(String name, String email) {
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("물고기 이름을 지어주세요.");
		}
		if (email == null || email.isBlank()) {
			throw new IllegalArgumentException("연락처를 남겨주세요.");
		}

		prepareFor(name);

		Fish fish = new Fish();
		fish.setName(name);

		// logo
		if (name.equalsIgnoreCase("whiteFish")) {
			fish.setLogo("\uD83D\uDEE5");
		} else if (name.equalsIgnoreCase("blackFish")) {
			fish.setLogo("T");
		}

		// color
		if (name.equalsIgnoreCase("whiteFish")) {
			fish.setColor("white");
		} else if (name.equalsIgnoreCase("blackFish")) {
			fish.setColor("black");
		}

		// notify
		sendEmailTo(email, fish);

		return fish;
	}

	private static void prepareFor(String name) {
		System.out.println(name + " 만들 준비 중");
	}

	private static void sendEmailTo(String email, Fish fish) {
		System.out.println(fish.getName() + " 다 만들었습니다.");
	}
}
