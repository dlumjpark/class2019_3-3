package kr.ac.daelim.uml.decorator.cafe;

public class CoffeeStore {
	public static void main(String[] args) {
		// 1번 음료: 하우스 블랜드 커피 (일반)
		Beverage beverage1 = new HouseBlend();
		System.out.println("주문한 음료: " + beverage1.getDescription());
		System.out.println("가격(원): " + beverage1.cost());
		
		// 2번 음료: 다크로스트, 두유라떼, 휘핑크림
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Soy(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println("주문한 음료: " + beverage2.getDescription());
		System.out.println("가격(원): " + beverage2.cost());		
		
		// 3번 음료: 디카페인, 우유
		Beverage beverage3 = new Decaf();
		beverage3 = new Milk(beverage3);
		System.out.println("주문한 음료: " + beverage3.getDescription());
		System.out.println("가격(원): " + beverage3.cost());		
		
		
	}
}
