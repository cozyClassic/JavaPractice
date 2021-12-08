package ParameterizeActivation;

public class Test1 {
	public static void main(String[] args) {

	}
}

// 목표 : 초록색 사과만 뽑기
class GreenApple {
	public static List<Apple> filterGreenApples(List<Apple inventory) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if(GREEN.equals(apple.getColor)) {
				result.add(apple);
			}
		}
	}
}

enum Color {RED, GREEN}

class Apple {
	private String color;

	string getColor {
		return this.color;
	}

}