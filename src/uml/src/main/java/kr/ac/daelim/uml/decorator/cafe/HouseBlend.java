package kr.ac.daelim.uml.decorator.cafe;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		this.description = "하우스블랜드";
	}
	
	@Override
	public int cost() {
		return 3000;
	}
}
