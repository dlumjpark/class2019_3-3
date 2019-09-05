package kr.ac.daelim.uml.decorator.cafe;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		this.description = "다크로스트";
	}
	
	@Override
	public int cost() {
		return 3200;
	}
}
